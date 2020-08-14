package com.ana.coronavirustracker.models;

/**
 * @author Ana on 8/11/2020
 */
public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int newCasesPerLastDay;

    public int getNewCasesPerLastDay() {
        return newCasesPerLastDay;
    }

    public void setNewCasesPerLastDay(int newCasesPerLastDay) {
        this.newCasesPerLastDay = newCasesPerLastDay;
    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
