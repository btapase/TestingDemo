package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {

	public AddPlace addPlacePayload(String name,String language, String address) {
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress(address);
		ap.setLanguage(language);
		ap.setPhone_number("44464");
		ap.setWebsite("https://rahulshettyacademy.com");
		ap.setName(name);
		List<String> myList = new ArrayList<String>();
		myList.add("shoepark");
		myList.add("parkshoe");
		ap.setTypes(myList);

		Location l = new Location();
		l.setLat(-52.55555);
		l.setLng(-52.55555);
		ap.setLocation(l);
		
		return ap;
	}
	
	public String deletePlacePayload(String place_id) {
		
		return "{\n" + 
				"    \"place_id\":\""+place_id+"\"\n" + 
				"}\n" + 
				"";
	}

}
