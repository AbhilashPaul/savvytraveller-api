package com.savvytraveller.travelpackage.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bookingReference;
    private Date bookingDate;
    private int travelerCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "package_id", referencedColumnName = "id", nullable = false)
    private TravelPackage travelPackage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
    private Customer customer;

    protected Booking() {
    }

    public Booking(String bookingReference, Date bookingDate, int travelerCount, TravelPackage travelPackage, Customer customer) {
        this.bookingReference = bookingReference;
        this.bookingDate = bookingDate;
        this.travelerCount = travelerCount;
        this.travelPackage = travelPackage;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public TravelPackage getTravelPackage() {
        return travelPackage;
    }

    public void setTravelPackage(TravelPackage travelPackage) {
        this.travelPackage = travelPackage;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public int getTravelerCount() {
        return travelerCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
