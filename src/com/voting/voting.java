package com.voting;
import java.util.Scanner;

public class voting {
    public static void main(String[] args){

        /*Asking for name*/
        Scanner nameIn = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = nameIn.nextLine();

        /*Asking for age*/
        Scanner ageIn =new Scanner(System.in);
        System.out.println("Your age: ");
        int age = ageIn.nextInt();

        /*The message*/
        System.out.print("Hello," + name+ " you are " + age + " years old!!");



    }
}
