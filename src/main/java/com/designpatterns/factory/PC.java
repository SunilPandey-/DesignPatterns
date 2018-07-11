package com.designpatterns.factory;

public class PC extends  Computer {

    private String ram;
    private String hdd;
    private String cpu;
    public PC(String ram, String hdd, String cpu){
       // System.out.println("pc constructor class called");
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public String getRAM() {
       // System.out.println("pc ram class called");
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
