import models.ExoPlanet;
import org.junit.Before;
import org.junit.Test;
import services.ExoPlanetService;

import static org.junit.Assert.assertEquals;

public class ExoPlanetServiceTest {

    private ExoPlanet exoPlanet1 = new ExoPlanet();
    private ExoPlanet exoPlanet2 = new ExoPlanet();
    private ExoPlanet[] exoPlanets = new ExoPlanet[2];

    private ExoPlanetService exoPlanetService;
    @Before
    public void setup() {
        exoPlanet1.setPlanetIdentifier("KOI-1843.03");
        exoPlanet1.setDiscoveryYear("2012");
        exoPlanet1.setHostStarTempK(12.0);
        exoPlanet1.setTypeFlag(3);
        exoPlanet1.setRadiusJpt(0.5);

        exoPlanet2.setPlanetIdentifier("Kepler-9 c");
        exoPlanet2.setDiscoveryYear("2014");
        exoPlanet2.setHostStarTempK(15.0);
        exoPlanet2.setRadiusJpt(1.5);
        exoPlanet2.setTypeFlag(0);

        exoPlanets[0] =exoPlanet1;
        exoPlanets[1] = exoPlanet2;
        exoPlanetService = new ExoPlanetService(exoPlanets);
    }

    @Test
    public void orphanPlanetsCount(){
          assertEquals(1,exoPlanetService.getOrphanPlanetsCount(exoPlanets));
    }

    @Test
    public void hottestStarPlanet(){
        assertEquals("Kepler-9 c",exoPlanetService.getHottestStarPlanet(exoPlanets));
    }

}
