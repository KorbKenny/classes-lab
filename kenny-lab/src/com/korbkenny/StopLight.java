package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/11/16.
 */
public class StopLight {
    private String mLightColor;

    public StopLight(String color){
        mLightColor = color;
    }

    public boolean isRed(){
        if(mLightColor.equals("red")){
            return true;
        } else {
            return false;
        }
    }

    public boolean isYellow(){
        if(mLightColor.equals("yellow")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGreen(){
        if(mLightColor.equals("green")){
            return true;
        } else {
            return false;
        }
    }

    public void setLightColor(String newColor){
        if (newColor.isEmpty()){
            System.out.println("Nah");
        } else {
            mLightColor = newColor;
        }
    }





}