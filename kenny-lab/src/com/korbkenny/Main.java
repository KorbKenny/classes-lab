package com.korbkenny;

public class Main {

    public static void main(String[] args) {
        StopLight theStopLight = new StopLight("red");
        Car myReallyCoolCar = new Car("Beige","Geo Prizm",50);

        for (int i = 0; i < 30; i++) {
            switch(i){
                case 0:
                case 3:
                case 6:
                case 9:
                case 12:
                case 15:
                case 18:
                case 21:
                case 24:
                case 27:
                    theStopLight.isGreen();
                    theStopLight.setLightColor("green");
                    System.out.println("The stoplight turns green");
                    myReallyCoolCar.go();
                    break;
                case 1:
                case 4:
                case 7:
                case 10:
                case 13:
                case 16:
                case 19:
                case 22:
                case 25:
                case 28:
                    theStopLight.isYellow();
                    theStopLight.setLightColor("yellow");
                    System.out.println("The stoplight turns yellow");
                    myReallyCoolCar.slow();
                    break;
                case 2:
                case 5:
                case 8:
                case 11:
                case 14:
                case 17:
                case 20:
                case 23:
                case 26:
                case 29:
                    theStopLight.isRed();
                    theStopLight.setLightColor("red");
                    System.out.println("The stoplight turns red.");
                    myReallyCoolCar.stop();
                    break;
            }
        }
    }
}
