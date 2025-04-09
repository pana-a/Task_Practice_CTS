package models.builders;

import interfaces.IBuilder;
import models.features.*;

public class PhoneBuilder implements IBuilder {
    Phone phone;

    public PhoneBuilder(String identifier, String version){
        phone = new Phone(identifier, version);
    }

    public PhoneBuilder addBattery(Battery battery){
        phone.setBattery(battery);
        return this;
    }

    public PhoneBuilder addAntenna (Antenna antenna){
        phone.setAntenna(antenna);
        return this;
    }

    public PhoneBuilder addSpeaker (Speaker speaker){
        phone.setSpeaker(speaker);
        return this;
    }

    public PhoneBuilder addCompass (Compass compass){
        phone.setCompass(compass);
        return this;
    }

    @Override
    public Phone build() {
        return phone;
    }
}
