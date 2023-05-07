package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ExoPlanetConstants;
import models.ExoPlanet;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import services.ExoPlanetService;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;

public class Main {
    private static ExoPlanetService planetService;
    private static void displayOrphanPlanetsCount(ExoPlanetService planetService, ExoPlanet[] exoPlanets) {
        System.out.println("There are "+planetService.getOrphanPlanetsCount(exoPlanets)+" Orphan Planets");
    }

    private static void displayHottestStarPlanet(ExoPlanetService planetService, ExoPlanet[] exoPlanets){
        System.out.println("The planet orbiting the hottest star is: "+planetService.getHottestStarPlanet(exoPlanets));
    }

    private static void displayTimelineData(ExoPlanetService planetService, ExoPlanet[] exoPlanets) {
        System.out.println(planetService.getTimelineData(exoPlanets));
    }

    public static void main(String[] args) throws IOException, ParseException {
        
        //Fetching the Json array data set and mapping it to ExoPlanet Pojo Object
        URL url = new URL(ExoPlanetConstants.DATA_URL);
        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse(new InputStreamReader(url.openStream()));
        ObjectMapper mapper = new ObjectMapper();
        ExoPlanet[] exoPlanets = mapper.readValue(array.toJSONString(), ExoPlanet[].class);

        planetService = new ExoPlanetService(exoPlanets);
        
        //Displaying the required information of the planets
        displayOrphanPlanetsCount(planetService,exoPlanets);
        displayHottestStarPlanet(planetService,exoPlanets);
        displayTimelineData(planetService,exoPlanets);
    }


}
