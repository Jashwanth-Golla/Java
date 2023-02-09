package com.jashwanth.oops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConstructorNoParams {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter Make:");
        String make = in.next();

        System.out.print("Enter the price:");
        int price = in.nextInt();

        System.out.print("Enter the year of Manufacture:");
        int year = in.nextInt();

        Car car1 = new Car(make,price,year);

        car1.print_details();

        System.out.print("Do You want to change your make?:[t/f]");

        if(in.next().charAt(0) == 't'){
            System.out.print("Enter the make yiu want: ");
            String newMake  = in.next();
            car1.change_make(newMake);
            System.out.println("Your Car details after the make: ");
            car1.print_details();
        }
    }

}

class Car{
    String make;
    int price;
    int year;

    Car(String make,int price,int year){
        this.make = make;
        this.price = price;
        this.year  = year;
    }

    void print_details(){
        System.out.println(this.make);
        System.out.println(this.price);
        System.out.println(this.year);
    }

    void change_make(String newMake){
        this.make = newMake;
    }
}
