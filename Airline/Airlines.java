import java.util.ArrayList;
import java.util.List;

public class Airlines {
    private List<Airline> airlines;

    public Airlines() {
        airlines = new ArrayList<>();
    }

    public Airlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public void addAirline(Airline airline){
        airlines.add(airline);
    }

    public void findAirlinesByDestination(String destination){
        for(Airline airline:airlines){
            if(airline.getDestination().equals(destination)){
                System.out.println(airline.toString());
            }
        }
    }

    public void findAirlinesByDay(String day){
        for(Airline airline:airlines){
            if(airline.getDay().equals(day)){
                System.out.println(airline.toString());
            }
        }
    }

    public void findAirlinesByDayAndTime(String day,Time time){
        for(Airline airline:airlines){
            if(airline.getDay().equals(day) && airline.getTime().isAfter(time)){
                System.out.println(airline.toString());
            }
        }
    }

}
