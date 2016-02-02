package org.learn.gson;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JSONObjectConverter 
{
    public static void main( String[] args )
    {
    	Gson objGson = new GsonBuilder().setPrettyPrinting().create();
    	Person objPerson = new Person("Mike", "harvey", 34, "001894536");
    	//Convert Person object to json
    	String json = objGson.toJson(objPerson);
    	System.out.println("1. Convert Person object to Json");
    	System.out.println(json);
    	
    	//Convert to json to person object
    	Type listType = new TypeToken<Person>() {}.getType();
    	System.out.println("2. Convert JSON to person object");
    	Person objFromJson = objGson.fromJson(json, listType);
    	System.out.println(objFromJson); 
    }
}
