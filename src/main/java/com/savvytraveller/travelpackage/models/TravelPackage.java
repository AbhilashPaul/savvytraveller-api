package com.savvytraveller.travelpackage.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "packages")
public class TravelPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String packageName;
    private String packageDescription;
    private BigDecimal packageBasePrice;
    private BigDecimal packageAgencyCommission;
    private Date packageStartDate;
    private Date packageEndDate;

    @OneToMany(mappedBy = "travelPackage")
    private Set<Booking> bookings;

    protected TravelPackage() {
    }

    public TravelPackage(String name, String description, BigDecimal basePrice, BigDecimal agencyCommission, Date startDate, Date endDate) {
        this.packageName = name;
        this.packageDescription = description;
        this.packageBasePrice = basePrice;
        this.packageAgencyCommission = agencyCommission;
        this.packageStartDate = startDate;
        this.packageEndDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public String getPackageDescription() {
        return packageDescription;
    }

    public String getPackageName() {
        return packageName;
    }

    public Date getPackageStartDate() {
        return packageStartDate;
    }

    public void setPackageStartDate(Date packageStartDate) {
        this.packageStartDate = packageStartDate;
    }

    public Date getPackageEndDate() {
        return packageEndDate;
    }

    public void setPackageEndDate(Date packageEndDate) {
        this.packageEndDate = packageEndDate;
    }

    public BigDecimal getPackageBasePrice() {
        return packageBasePrice;
    }

    public void setPackageBasePrice(BigDecimal packageBasePrice) {
        this.packageBasePrice = packageBasePrice;
    }

    public BigDecimal getPackageAgencyCommission() {
        return packageAgencyCommission;
    }

    public void setPackageAgencyCommission(BigDecimal packageAgencyCommission) {
        this.packageAgencyCommission = packageAgencyCommission;
    }
}
