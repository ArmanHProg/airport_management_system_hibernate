package com.bdg.model;

import com.bdg.validator.Validator;

import java.util.Objects;

public class AddressMod {

    private int id;
    private String country;
    private String city;


    public AddressMod(final String country, final String city) {
        setCountry(country);
        setCity(city);
    }

    public AddressMod() {
    }


    public int getId() {
        return id;
    }

    public void setId(final int id) {
        Validator.checkId(id);
        this.id = id;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        Validator.validateString(country);
        this.country = country;
    }


    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        Validator.validateString(city);
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressMod that = (AddressMod) o;
        return Objects.equals(country, that.country) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }


    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                "}\n";
    }
}