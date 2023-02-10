package com.jashwanth.oops.package2;

import static com.jashwanth.oops.package1.Greeting.greeting;

public class CallAnotherPackage {
    public static void main(String[] args) {
        System.out.println("Hello, You are in Package 2, Calling another package");
        greeting();
    }
}
