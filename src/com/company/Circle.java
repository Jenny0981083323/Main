package com.company;
//this keyword 關鍵字
public class Circle {
    public double radius;//變數有效範圍
    public   static  final double PI=3.14;//靜態static,因為很多Class會用到
    public Circle(){
        this(1.0);//c2


    }
    public  Circle(double radius){//c1
        this.radius=radius;

    }
    public  double computeArea(){
        return Circle.PI*Math.pow(this.radius,2);//3.14*radius平方
    }

}
