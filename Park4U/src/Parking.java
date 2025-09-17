
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javaspringboot
 */
public class Parking {
    public static final ArrayList<Vehicle> allVehicles = new ArrayList<>();
    public static final DateTimeFormatter HHMM = DateTimeFormatter.ofPattern("HH:mm");
    public static final int[] spacesAvailablePerFloor = {30,40,40,50};
    
    



    public static LocalTime parseTime(String hhmm){
        try{
            
            return LocalTime.parse(hhmm,HHMM);
            
        } catch(DateTimeParseException e){
            return null;
        }
    }
    
    public static String formatTime(LocalTime t){
        return t.format(HHMM);
    }
    
    public static int minutesBetween(LocalTime entry,LocalTime exit){
        
        if(exit.isBefore(entry) || exit.equals(entry)){
            return (int) Duration.between(entry, exit.plusHours(24)).toMinutes();
        } else {
            return (int) Duration.between(entry, exit).toMinutes();
        }
        
    }

    public static boolean inNightTime(LocalTime time) {
        LocalTime startNight = LocalTime.of(21, 0); // 21:00
        LocalTime endNight = LocalTime.of(6, 0);   // 06:00

        return (time.equals(startNight) || time.isAfter(startNight)) || (time.equals(endNight) || time.isBefore(endNight));
}
}
