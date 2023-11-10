import java.util.Scanner;
public class Schedule  {

  private String days;
 private String doctors;

    public Schedule(String days,String doctors) {

        this.doctors=doctors;
        this.days=days;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDoctors() {
        return doctors;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }
    public boolean isDayValid(String day){
        return  days.contains(day);
    }
    public String getDoctorsForDay(String day) {
        if (isDayValid(day)) {
            return doctors;
        }
        return day;
    }


    }












