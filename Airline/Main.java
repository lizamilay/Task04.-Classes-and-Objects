public class Main {
    public static void main(String[] args) {
        Airlines airlines = new Airlines();
        Airline air1 = new Airline("Moscow",22,"Boeieieing","Monday", new Time(2,2,2));
        Airline air2 = new Airline("Minsk",3,"Boeieieing","Sunday", new Time(1,25,25));
        airlines.addAirline(air1);
        airlines.addAirline(air2);
        airlines.findAirlinesByDay("Monday");
        airlines.findAirlinesByDestination("Minsk");
        airlines.findAirlinesByDayAndTime("Sunday",new Time(1,25,2));
        airlines.findAirlinesByDayAndTime("Sunday",new Time(1,25,26));

    }
}
