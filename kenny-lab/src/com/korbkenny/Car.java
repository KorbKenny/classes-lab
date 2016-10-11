package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/11/16.
 */
public class Car {

    private String mColor;
    private String mBrand;
    private int mTopSpeed;

    public Car(String color, String brand, int topSpeed){
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }

    public void go(){
        System.out.println("    The pedal is, how you say, to the metal,");
        System.out.println("    going from zero to sixty in 4.2 seconds.");
    }

    public void slow(){
        System.out.println("    I'd normally speed up to make the light,");
        System.out.println("    but in this example, I should slow down.");
    }

    public void stop(){
        System.out.println("    Pushing the breaks, the car rolls to a stop.");
        System.out.println("    Every time, I'm terrified it will stall out.");
        System.out.println("    Perhaps this is the end of my beautiful car.");
    }

    public String getColor(){
        return mColor;
    }

    public String getBrand(){
        return mBrand;
    }

    public int getTopSpeed(){
        return mTopSpeed;
    }

    public void setColor(String newColor){
        if(newColor.isEmpty()){
            System.out.println("Must be a color.");
        } else {
            mColor = newColor;
        }
    }

    public void setBrand(String newBrand){
        if(newBrand.isEmpty()){
            System.out.println("Must be a brand.");
        } else {
            mBrand = newBrand;
        }
    }

    public void setTopSpeed(int newTopSpeed){
        if(newTopSpeed <= 0){
            System.out.println("Must be a working car that goes above zero.");
        } else{
            mTopSpeed = newTopSpeed;
        }
    }
}
