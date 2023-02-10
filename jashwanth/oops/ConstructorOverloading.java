package com.jashwanth.oops;


public class ConstructorOverloading {
    public static void main(String[] args) {
        Trainee t1 = new Trainee();
        t1.print_details();
        System.out.println("------------------------------------");
        Trainee t2 = new Trainee(102,"Kiran",98);
        t2.print_details();
        System.out.println("-------------------------------------");
        Trainee t3 = new Trainee(t1);
        t3.print_details();
        Trainee t4 = new Trainee();
        t4.print_details();
        // Assigning an object to another object
        Trainee t5 = t2;
        t5.print_details();

    }
}

class Trainee {
    int id;
    String name;
    int marks;

    // Constructor with no parameters
//    Trainee(){
//        System.out.println("Constructor with NO parameters called");
//        this.id = 100;
//        this.name = "Jashwanth";
//        this.marks= 98;
//    }

    // Constructor with parameters
    Trainee(int id, String name, int marks){
        System.out.println("Constructor with parameters called");
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Constructor that uses other constructor as parameter
    Trainee(Trainee other){
        System.out.println("Constructor with other constructor as parameters called");
        this.id = other.id;
        this.name = other.name;
        this.marks = other.marks;
    }
    // Constructor calling another constructor
    Trainee(){
        this (13,"New",23);
    }

    void print_details(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}
