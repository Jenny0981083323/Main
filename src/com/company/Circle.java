package com.company;

public class Circle {
    private double radius;
    public Circle(){
        this(10);

    }
    public  Circle(double myRadius){
        this.radius=myRadius;

    }
    public  double computeArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

}
