package com.pradeep.Country.Service.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String country;

    private String capital;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
