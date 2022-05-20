package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] student_name={"mehdi","mamad","ahmad","alireza"};
        String[] cars=new String[3];

        cars[0]="bmw";
        cars[1]="peraydo";
        cars[2]="peykan";

        student_name[0]="ali";

//        System.out.println(cars[1]);

//        System.out.println(cars.length);
//
//        for (int i=0;i< cars.length;i++){
//            System.out.println(cars[i]);
//        }

//        for (String i:student_name){
//            System.out.println(i);
//        }

        System.out.println(Arrays.toString(cars));

        int [][] numbers={{1,2,3,55,22},{4,5,6},{7}};

//        numbers[1][1]=88;
//        System.out.println(numbers[1][1]);

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                System.out.printf("%3d",numbers[i][j]);
            }
            System.out.println();
        }
    }
}
