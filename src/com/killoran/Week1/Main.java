package com.killoran.Week1;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        String city = "Grove City";
        int zip = 43123;
        int highs[] = {70, 80, 78, 90, 72};
        float sum = 0;
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zip);
        for(i = 0; i<5; i++) {
            sum = sum + highs[i];
        }
        float avgHigh = sum/i;
        System.out.println("Average High Temperature: " + avgHigh);
    }
}
