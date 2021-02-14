public class Airline {
    private String destination;
    private int number;
    private String airplaneType;
    private String day;
    private Time time;

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", airplaneType='" + airplaneType + '\'' +
                ", day='" + day + '\'' +
                ", time=" + time.toString() +
                '}';
    }

    public Airline(String destination, int number, String airplaneType, String day, Time time) {
        this.destination = destination;
        this.number = number;
        this.airplaneType = airplaneType;
        this.day = day;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

}
