package models.builders;

import models.features.AFeature;

public class Phone {
    //Atribute obligatorii
    private String identifier;
    private String version;
    //Atribute optionale
    private AFeature battery;
    private AFeature antenna;
    private AFeature compass;
    private AFeature speaker;

    Phone(String identifier, String version) {
        this.identifier = identifier;
        this.version = version;
    }

    void setBattery(AFeature battery) {
        this.battery = battery;
    }

    void setAntenna(AFeature antenna) {
        this.antenna = antenna;
    }

    void setCompass(AFeature compass) {
        this.compass = compass;
    }

    void setSpeaker(AFeature speaker) {
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return "Phone: " +
                "\nidentifier: " + identifier +
                "\nversion: " + version +
                "\nbattery: " + battery +
                "\nantenna: " + antenna +
                "\ncompass: " + compass +
                "\nspeaker: " + speaker;
    }
}