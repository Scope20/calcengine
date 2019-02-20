package com.pluralsight.flight;

public class Flight {

    static final int MAX_FAA_SEATS = 550;

    private int passengers;
    private char flightClass;

    private int seats = 150;

    private boolean[] isSeatAvailable;
    private int flightNumber;
    private int maxCarryOns = seats * 2, totalCarryOns;

    Flight f175 = new Flight(175);
    CargoFlight cf = new CargoFlight();
    CargoFlight cf294 = new CargoFlight(294);
    CargoFlight cfBig = new CargoFlight(5000.0f);

    {
        isSeatAvailable = new boolean[seats];       // Initialisation Block
                                                    // This block of code will be executed at the start of each constructor
        for (int i = 0; i < seats; i++)

            isSeatAvailable[i] = true;

    }

    public Flight() { }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }

//    public void addPassengers(Passenger... list) {
//
//        if (hasSeating(list.length)) {
//            passengers += list.length;
//
//            for (Passenger passenger : list)
//                totalCheckedBags +=
//                        passenger.getCheckedBags();
//        }
//
//        else
//
//            handleTooMany();
//    }
//
//    public void add1Passenger() {
//        if (hasSeating())
//            passengers += 1;
//        else
//            handleTooMany();
//    }

//    public void add1Passenger(int bags) {
//
//        if (hasSeating()) {
//            add1Passenger();
//            totalCarryOns += bags;
//        }
//    }

//    public void add1Passenger(Passenger p) {
//        add1Passenger(p.getCheckedBags());
//    }
//
//    public void add1Passenger(int bags, int carryOns) {
//
//        if (hasSeating()) {
//            add1Passenger(bags);
//            totalCarryOns += carryOns;
//        }
//    }

//    public void add1Passenger(Passenger p, int carryOns) {
//        add1Passenger(p.getCheckedBags(), carryOns);
//    }


    public void setSeats(int seats) {
        if (seats <= MAX_FAA_SEATS)
            this.seats = seats;
        //else
            //handle error
    }

//    private boolean hasSeating() {
//        return passengers + count <= seats;
//    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns <= maxCarryOns;
    }



}
