package com.designpatterns.factory;

public abstract class Computer {

    /*Super class in factory design pattern can be an interface, abstract class or a normal java class.
    For our factory design pattern example, we have abstract super class with overridden toString() method
    for testing purpose.*/

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        //System.out.println("abstract class called");
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
