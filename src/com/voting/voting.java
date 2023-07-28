package com.voting;
import java.math.BigInteger;
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

        /*Asking for ID number*/
        Scanner idNumIn = new Scanner(System.in);
        System.out.println("Your national nuumber: ");
        BigInteger idNum = idNumIn.nextBigInteger();

        /*The message*/
        System.out.print("Hello," + name+ " you are " + age + " years old!!" + " And your national number is :" + idNum);



    }

}
