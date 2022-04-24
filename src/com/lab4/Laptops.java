package com.lab4;

public class Laptops {
    private String firm;
    private int videoMemory;
    private int ram;
    private boolean sensory;
    private int price;
    private String videoMemoryInfo;
    private String ramInfo;
    private String sensoryInfo;
    private String priceInfo;

    public void setInfo(String firm, int videoMemory, int ram, boolean sensory, int price) {

        firm = firm.replaceAll("\\s+", "");
        this.firm = firm.substring(0, 1).toUpperCase() + firm.substring(1).toLowerCase();

        videoMemoryInfo = videoMemory > 0 ? String.valueOf(videoMemory) : "Incorrect value";
        this.videoMemory = videoMemory;

        ramInfo = ram > 0 ? String.valueOf(ram) : "Incorrect value";
        this.ram = ram;

        sensoryInfo = sensory ? "Yes" : "No";
        this.sensory = sensory;

        priceInfo = price > 0 ? String.valueOf(price) : "Incorrect value";
        this.price = price;
    }

    public void getFirm() {
        System.out.println("Firm: " + firm);
    }

    public void getVideoMemory() {
        System.out.println("Video Memory: " + videoMemoryInfo);
    }

    public void getRam() {
        System.out.println("RAM: " + ramInfo);
    }

    public void getPrice() {
        System.out.println("Price: " + priceInfo);
    }

    public void getSensory() {
        System.out.println("Touch screen: " + sensoryInfo);
    }

    public void getInfo() {
        if (!sensory) {
            getFirm();
            getVideoMemory();
            getRam();
            getSensory();
            getPrice();
            System.out.println("");
        }
    }
}