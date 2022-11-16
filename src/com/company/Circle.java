package com.company;
//this keyword 關鍵字
public class Circle {
    public double radius;//變數有效範圍
    public Circle(){
        this(1.0);//c2

    }
    public  Circle(double myRadius){//c1
        this.radius=myRadius;

    }
    public  double computeArea(){
        return Math.PI*Math.pow(this.radius,2);//3.14*radius平方
    }

}
