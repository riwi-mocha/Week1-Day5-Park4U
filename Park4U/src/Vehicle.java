import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    private String licensePlate;
    private String type; 
    private int pricePerHour;
    private LocalTime entryTime;
    private int quantityEntries;
    private boolean hasMembership;

    public Vehicle(String licensePlate, String type, int pricePerHour, String entryTimeHHmm, int quantityEntries, boolean hasMembership) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.pricePerHour = pricePerHour;
        this.entryTime = LocalTime.parse(entryTimeHHmm, DateTimeFormatter.ofPattern("HH:mm"));
        this.quantityEntries = quantityEntries;
        this.hasMembership = hasMembership;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getType() {
        return type;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public String getEntryTimeFormatted() {
        return entryTime.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public int getQuantityEntries() {
        return quantityEntries;
    }
    public boolean isHasMembership() {
        return hasMembership;
    }
}