package com.bdg.persistent;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "trip")
public class TripPer {

    @Id
    @Column(name = "trip_number")
    private int tripNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)
    private CompanyPer company;

    @Column(nullable = false, length = 24)
    private String airplane;

    @Column(name = "town_from", nullable = false, length = 24)
    private String townFrom;

    @Column(name = "town_to", nullable = false, length = 24)
    private String townTo;

    @Column(name = "time_out", nullable = false)
    private Timestamp timeOut;

    @Column(name = "time_in", nullable = false)
    private Timestamp timeIn;


    public TripPer() {
    }

    public int getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(final int tripNumber) {
        this.tripNumber = tripNumber;
    }

    public CompanyPer getCompany() {
        return company;
    }

    public void setCompany(final CompanyPer companyPer) {
        this.company = companyPer;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(final String airplane) {
        this.airplane = airplane;
    }

    public String getTownFrom() {
        return townFrom;
    }

    public void setTownFrom(final String townFrom) {
        this.townFrom = townFrom;
    }

    public String getTownTo() {
        return townTo;
    }

    public void setTownTo(final String townTo) {
        this.townTo = townTo;
    }

    public Timestamp getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(final Timestamp timeOut) {
        this.timeOut = timeOut;
    }

    public Timestamp getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(final Timestamp timeIn) {
        this.timeIn = timeIn;
    }
}