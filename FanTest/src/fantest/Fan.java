/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantest;

/**
 *
 * @author wannu
 */
   
public class Fan {
    public static int SLOW=1;
    public static int MEDIUM=2;
    public static int FAST=3;
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    

public Fan()
{
   this.speed=SLOW;
   this.on=false;
   this.radius=5;
   this.color="white";
}
public Fan(int speed,boolean on,double radius,String color)
{
    this.speed=speed;
    this.on=on;
    this.radius=radius;
    this.color=color;
}
public int getSpeed()
{
    return speed;
}
public boolean getOn()
{
    return on;
}
public double getRadius()
{
    return radius;
}
public String getcolor()
{
    return color;
}
public void setSpeed(int s)
{
   speed=s;
}
public void setOn(boolean o)
{
    this.on=o;
}
public void setRadius(double r)
{
    radius=r;
            
 }
public void setcolor(String c)
{
    color=c;
}
@Override
public String toString() 
{

   return "The fan color: "+ color +"\nThe fan speed: "+speed+"\nThe fan radius= "+radius+((on)? "\nThe fan is on":"\nThe fan is off");
}
}


