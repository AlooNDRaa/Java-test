package org.Alondra.Entity;

public class Vehicle {

    private String Brand;

    private String Model;

    private int Mileage;


    public Vehicle(String Brand, String Model, int Mileage) {
        this.Brand = Brand;
        this.Model = Model;
        this.Mileage = Mileage;
    }

    public boolean needMilageRevision() {
        return  Mileage > 10000;
    }

    public void setInformationCars(){
        System.out.println("Marca: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Milage: " + Mileage);
    }


}
