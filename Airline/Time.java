public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time( int hours, int minutes, int seconds){
        if((hours<24 && hours>=0)&&(minutes <60 && minutes>=0)&&(seconds<60 && seconds>=0)){
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        else{
            throw new RuntimeException("error");
        }
    }

    public void setHours(int hours){
        if(hours<24 && hours>=0){
            this.hours=hours;
        }
        else{
            this.hours=0;
        }
    }

    public void setMinutes(int minutes){
        if(minutes<60 && minutes>=0){
            this.minutes=minutes;
        }
        else{
            this.minutes=0;
        }
    }

    public void setSeconds(int seconds){
        if(seconds<60 && seconds>=0){
            this.seconds=seconds;
        }
        else{
            this.seconds=0;
        }
    }

    public void setAddTime(int addHours, int addMinutes, int addSeconds){
        hours+=addHours;
        minutes+=addMinutes;
        seconds+=addSeconds;
        if(seconds>59){
            minutes+=seconds/60;
            seconds=seconds%60;
        }
        if(minutes>59){
            hours+=minutes/60;
            minutes=minutes%60;
        }
        if(hours>23){
            hours=hours%24;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public void setAddTime(Time addTime){
        setAddTime(addTime.hours,addTime.minutes,addTime.seconds);
    }

    public boolean isAfter(Time time){
        return timeToSeconds(this) - timeToSeconds(time) > 0;
    }

    public static int timeToSeconds(Time time){
        return time.hours*3600+time.minutes*60+time.seconds;
    }
}
