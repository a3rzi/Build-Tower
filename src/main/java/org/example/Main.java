package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //given positive integer
        System.out.println("please enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        int nFloors = input.nextInt();
        //when
        List<String> tower = towerBuilder(nFloors);
        for (String floor : tower) {
            System.out.println(floor);
        }
    }
    private static List<String> towerBuilder(int nFloors) {
        List<String> tower = new ArrayList<>();
        // Build each nFloors of the tower
        for (int i = 0; i< nFloors; i++){
            // Calculate the number of stars and spaces for this nFloors
            int star = (2*i)+1;
            int space = nFloors-i-1;
            StringBuilder floorBuilder = new StringBuilder();
            for (int j =0; j<space;j++){
                floorBuilder.append(" ");
            }
            for (int j =0; j<star;j++){
                floorBuilder.append("*");
            }
            for (int j =0; j<space;j++){
                floorBuilder.append(" ");
            }
            tower.add(floorBuilder.toString());
        }
        return tower;
    }
}