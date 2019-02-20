package com.pluralsight.flight;

public class FullLicencePilot extends Pilot {

    @Override
    public boolean canAccept(Flight f) {
        return true;
    }
}
