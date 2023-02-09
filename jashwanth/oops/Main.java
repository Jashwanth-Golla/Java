package com.jashwanth.oops;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
//        System.out.println(s1.marks);
//        System.out.println(s1.is_topper);

        s1.id = 101;
        s1.marks = 98;
        s1.is_topper = s1.marks > 90;
        s1.name = "Jashwanth Golla";

        s1.printDetails();



    }

}
class Student {
    String name = "NO Name Yet";
    int marks;
    int id;
    boolean is_topper;

    void printDetails(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.marks);
        System.out.println(this.is_topper);
    }
}