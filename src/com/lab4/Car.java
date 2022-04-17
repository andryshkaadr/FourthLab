package com.lab4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Car {
    private String model;
    private String fabricator;
    private String type;
    private LocalDate dateOfManufacture = LocalDate.now();
    private LocalDate dateOfInspection = LocalDate.now();
    private LocalDate dateOfRegistration = LocalDate.now();
    LocalDate actualDate = LocalDate.now();

    public void setCarInfo(String model, String fabricator, String type, LocalDate dateOfManufacture) {
        this.model = model;
        this.fabricator = fabricator;
        this.type = type;
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setDateOfInspection(LocalDate dateOfInspection) {
        this.dateOfInspection = dateOfInspection;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public void getCarInfo() {
        if (12 >= ChronoUnit.MONTHS.between(dateOfInspection, actualDate)) {
            System.out.println(fabricator + " " + model + "\nBody type: " + type + "\nDate of manufacture: " + dateOfManufacture +
                    "\nDate of registration:" + dateOfRegistration + "\nDate of inspection: " + dateOfInspection + "\n");
        }
    }
}
