
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
    public static final ArrayList<Vehicle> vehiclesParked = new ArrayList<>();
    public static final DateTimeFormatter HHMM = DateTimeFormatter.ofPattern("HH:mm");
    public static final int[] spacesAvailablePerFloor = {0,40,40,50};
    
    
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
}
