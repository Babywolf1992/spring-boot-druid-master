package com.babywolf.entity;

/**
 * Created by babywolf on 17/3/19.
 */
public class Country extends BaseEntity {
    private String countryname;
    private String countrycode;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}
