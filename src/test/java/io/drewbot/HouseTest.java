package io.drewbot;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HouseTest {
    @Test
    public void FinishWillNotChangeBuildingStatusIfNothingSet() throws Exception {
        House myHouse = new House();
        myHouse.finish();
        assertEquals(myHouse.getBuildingStatus(), true);
    }

    @Test
    public void finishWillChangeBuildingStatusIfEverythingSet() throws Exception {
        House myHouse = new House();
        myHouse.setRoofColor("pink");
        myHouse.setHasRoof(true);
        myHouse.finish();
        assertEquals(myHouse.getBuildingStatus(), false);
    }
}
