package io.drewbot;

public class House {

    private boolean hasRoof;
    private String roofColor;
    private boolean isBuilding;

    public House() {
        roofColor = "";
        isBuilding = true;
    }

    public void finish() {
        if (roofColor.length() > 0 && hasRoof) {
            isBuilding = false;
        }
    }

    public boolean getBuildingStatus() {
        return isBuilding;
    }

    public boolean getHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public String getRoofColor() {
        return roofColor;
    }

    public void setRoofColor(String roofColor) {
        this.roofColor = roofColor;
    }
}
