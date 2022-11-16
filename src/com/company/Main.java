package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Circle c1=new Circle(10);
        System.out.println(c1.computeArea());


        Circle c2 = new Circle();
        System.out.println(c2.radius);
        System.out.println(c2.computeArea());
        System.out.println(c2.PI);//P.15 (5)


    }
}
