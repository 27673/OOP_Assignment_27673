package _27673.Q2;

import java.util.Date;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, Date createDate, Date updateDate, String airportName, String code, String location) {
        super(id, createDate, updateDate);
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}