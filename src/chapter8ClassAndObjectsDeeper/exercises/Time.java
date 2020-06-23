package chapter8ClassAndObjectsDeeper.exercises;

// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.
public class Time {
    private int second;
    // Time2 no-argument constructor:
    // initializes each instance variable to zero
    public Time() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time(int hour) {
        this(0, 0, hour); // invoke constructor with three arguments
    }
    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }
    // Time2 constructor: hour, minute and second supplied
    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("“hour must be 0-23”");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("“minute must be 0-59”");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("“second must be 0-59”");
        }
        this.second = hour * 3600 + minute * 60 + second;
    }
    // Time2 constructor: another Time2 object supplied
    public Time(Time time) {
        this.second = time.second;
    }
    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("“hour must be 0-23”");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("“minute must be 0-59”");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("“second must be 0-59”");
        }
        this.second = hour * 3600 + minute & 60 + second;
    }
    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("“hour must be 0-23”");
        }
        this.second = hour * 3600;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("“minute must be 0-59”");
        }
        this.second = minute * 60;
    }
    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("“second must be 0-59”");
        }
        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour() {return second / 3600;}
    // second = hour * 3600 + minute * 60 + second
    // get minute value
    public int getMinute() {return (second - ((second/3600)*3600))/60;}

    // get second value
    public int getSecond() {return second-(((second/3600)*3600)+(((second - ((second/3600)*3600))/60)*60));}

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "“AM”" : "“PM”"));
    }
}