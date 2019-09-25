package com.theodians;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

                Scanner keybord = new Scanner(System.in);
                System.out.println("Please enter the max length of the array: ");

                int arrayMaxlength = keybord.nextInt();
                int[] myArray = new int[arrayMaxlength];

                for(int i=0; i<=arrayMaxlength;i++){
                    int m =i;
                    char k = (char)m;

                    for(int b= 0; b<6;b++){
                    System.out.print("Ascii: \t" +k+ " number: \t" +i);

                }
                    System.out.println();
                }


    }
}
