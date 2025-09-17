import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    public String licensePlate;
    public String type; 
    public int pricePerHour;
    public LocalTime entryTime;
    public int quantityEntries;
    public boolean hasMembership;
    public boolean isParked;
    public String membershipName;
    public double membershipPrice;
    public String agreementName;
    public double agreementDiscount;
    public int floorParked;

    public Vehicle(String licensePlate, String type, int pricePerHour, LocalTime entryTime, int quantityEntries, boolean hasMembership, boolean isParked, String membershipName, double membershipPrice) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.pricePerHour = pricePerHour;
        this.entryTime = entryTime;
        this.quantityEntries = quantityEntries;
        this.hasMembership = hasMembership;
        this.isParked = isParked;
        this.membershipName = membershipName;
        this.membershipPrice = membershipPrice;
    }

    public Vehicle(String licensePlate, String type, int pricePerHour, LocalTime entryTime, int quantityEntries, boolean hasMembership, boolean isParked) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.pricePerHour = pricePerHour;
        this.entryTime = entryTime;
        this.quantityEntries = quantityEntries;
        this.hasMembership = hasMembership;
        this.isParked = isParked;
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

    public boolean isParked() {
        return isParked;
    }
}