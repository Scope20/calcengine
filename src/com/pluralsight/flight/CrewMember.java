package com.pluralsight.flight;

public class CrewMember {

    private FlightCrewJob job;

    public CrewMember(FlightCrewJob job) {
        this.job = job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }


    CrewMember james = new CrewMember(FlightCrewJob.Pilot);

}
