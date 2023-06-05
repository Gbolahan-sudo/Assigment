package Reflection;

import org.junit.Test;

import static Reflection.PoliticalZones.NORTH_WEST;
import static org.junit.jupiter.api.Assertions.*;

class PoliticalZonesTest {

@Test
    public void politicalZones(){
    PoliticalZones politicalZones = NORTH_WEST;
    politicalZones.setRegion("Lagos");

    }

}