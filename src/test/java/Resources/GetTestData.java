package Resources;

import io.restassured.RestAssured;
import pojo.GooglePlaceAPI.GoogleAddPlaceAPIRequest;
import pojo.GooglePlaceAPI.Location;

import java.io.IOException;
import java.util.ArrayList;

public class GetTestData extends Utils{
    public GoogleAddPlaceAPIRequest addPlacePayload(String name, String language, String address){
        try {
            RestAssured.baseURI = getGlobalValue("baseUrl");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        GoogleAddPlaceAPIRequest googleAddPlaceAPIRequest = new GoogleAddPlaceAPIRequest();
        Location location = new Location();
        location.setLat(41.878932334121);
        location.setLng(-87.66676744998608);
        googleAddPlaceAPIRequest.setLocation(location);
        googleAddPlaceAPIRequest.setAccuracy(20);
        googleAddPlaceAPIRequest.setName(name);
        googleAddPlaceAPIRequest.setPhone_number("+1-5058188687");
        googleAddPlaceAPIRequest.setAddress(address);
        googleAddPlaceAPIRequest.setLanguage(language);
        ArrayList<String> types = new ArrayList<>();
        types.add("New");
        types.add("types");
        googleAddPlaceAPIRequest.setWebsite("https://Google.com");
        googleAddPlaceAPIRequest.setTypes(types);
        googleAddPlaceAPIRequest.setLanguage("En-Fr");
        return googleAddPlaceAPIRequest;
    }
}
