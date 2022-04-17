package com.lab4;

public class Laptops {
    private String firm;
    private int videoMemory;
    private int ram;
    private boolean sensory;
    private int price;

    public void setInfo(String firm, int videoMemory, int ram, boolean sensory, int price) {
        this.firm = firm;
        this.videoMemory = videoMemory;
        this.ram = ram;
        this.sensory = sensory;
        this.price = price;
    }

    public void getInfo() {
        if (!sensory) {
            String info = firm + "\t" + videoMemory + "\t\t\t\t\t" + ram + "\t\t\t" + sensory + "\t\t\t  " + price;
            System.out.println(info);
        }
    }
}
