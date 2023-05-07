package services;

import models.ExoPlanet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class ExoPlanetService {

    private  ExoPlanet[] exoPlanets;

    public ExoPlanetService(ExoPlanet[] exoPlanets){
        this.exoPlanets = exoPlanets;
    }

    public long getOrphanPlanetsCount(ExoPlanet[] exoPlanets){
        return Arrays.stream(exoPlanets).filter(planet->planet.getTypeFlag()==3).count();
    }

    public String getHottestStarPlanet(ExoPlanet[] exoPlanets){
        return Arrays.stream(exoPlanets).max(Comparator.comparingDouble(exoPlanet-> Optional.ofNullable(exoPlanet.getHostStarTempK()).orElse(0.0))).get().getPlanetIdentifier();
    }

    public StringBuilder getTimelineData(ExoPlanet[] exoPlanets) {
        StringBuilder result =new StringBuilder("");
        AtomicLong smallCount = new AtomicLong();
        AtomicLong mediumCount = new AtomicLong();
        AtomicLong largeCount = new AtomicLong();
        Arrays.stream(exoPlanets)
                .collect(Collectors.groupingBy(ExoPlanet::getDiscoveryYear,TreeMap::new,toList())).forEach((discoveryYear, planetsInYear)->{
                    smallCount.set(planetsInYear.stream().filter(planet -> planet.getRadiusJpt() != null && planet.getRadiusJpt() <= 1).count());
                    mediumCount.set(planetsInYear.stream().filter(planet -> planet.getRadiusJpt() != null && planet.getRadiusJpt() > 1 && planet.getRadiusJpt() <= 2).count());
                    largeCount.set(planetsInYear.stream().filter(planet -> planet.getRadiusJpt() != null && planet.getRadiusJpt() > 2).count());

                  //  });
                    if(discoveryYear == null || discoveryYear == ""){
                        result.append("The year of discovery is unknown for "+smallCount+" small planet(s), "+mediumCount+" medium planet(s) and "+largeCount+" large planet(s) \n");
                    }
                    else {
                        result.append("In the year " + discoveryYear + ", " + smallCount + " small planet(s), " + mediumCount + " medium planet(s) and " + largeCount + " large planet(s) were discovered. \n");
                    }

                });
        return result;
    }
}
