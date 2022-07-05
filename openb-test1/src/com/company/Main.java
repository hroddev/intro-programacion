package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int num1 = 1;
        int num2 = 2;
        int num3 = 10;
        System.out.println(suma(num1, num2, num3));
        Car myCar = new Car();
        myCar.AddDoors();
        System.out.println("My car have: " + myCar.doors);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Car {
    public int doors = 3;

    public void AddDoors() {
        this.doors++;
    }
}

