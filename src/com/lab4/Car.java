package com.lab4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Car {
    private String carInfo;
    private String model;
    private String fabricator;
    private String type;
    private LocalDate dateOfManufacture = LocalDate.now();
    private LocalDate dateOfInspection = LocalDate.now();
    private LocalDate dateOfRegistration = LocalDate.now();
    private String dateOfManufactureInfo;
    private String dateOfInspectionInfo;
    private String dateOfRegistrationInfo;
    LocalDate actualDate = LocalDate.now();

    public void setCarInfo(String model, String fabricator, String type, LocalDate dateOfManufacture) {
        fabricator = fabricator.replaceAll("\\s+", "");
        fabricator = fabricator.substring(0, 1).toUpperCase() + fabricator.substring(1).toLowerCase();
        this.fabricator = fabricator;

        model = model.replaceAll("\\s+", "");
        model = model.substring(0, 1).toUpperCase() + model.substring(1).toLowerCase();
        this.model = model;

        type = type.replaceAll("\\s+", "");
        type = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
        this.type = type;

        dateOfManufactureInfo = ChronoUnit.DAYS.between(dateOfManufacture, actualDate) > 0 ? String.valueOf(dateOfManufacture) : "Incorrect date";
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        dateOfRegistrationInfo = ChronoUnit.DAYS.between(dateOfRegistration, actualDate) > 0 ? String.valueOf(dateOfRegistration) : "Incorrect date";
        this.dateOfRegistration = dateOfRegistration;
    }

    public void setDateOfInspection(LocalDate dateOfInspection) {
        dateOfInspectionInfo = ChronoUnit.DAYS.between(dateOfInspection, dateOfManufacture) < 0 ? String.valueOf(dateOfInspection) : "Incorrect date";
        this.dateOfInspection = dateOfInspection;
    }

    public void getCarInfo() {
        carInfo = fabricator + " " + model + "\nBody type: " + type + "\nDate of manufacture: " + dateOfManufactureInfo +
                "\nDate of registration: " + dateOfRegistrationInfo + "\nDate of inspection: " + dateOfInspectionInfo + "\n";
        if (ChronoUnit.MONTHS.between(dateOfInspection, actualDate) <= 12) {
            System.out.println(carInfo);
        }
    }
}
