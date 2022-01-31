/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package fantest;

import java.util.Scanner;

/** 2022, new
 *
 * @author Nene Wann
 */
public class FanTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fan fan1=new Fan();
 System.out.println("*****The first fan*****");
        fan1.setOn(false);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setcolor("blue");
        fan1.setRadius(2.5);
        System.out.println(fan1.toString());
        System.out.println("*****The second fan*****");
        
        Fan fan2=new Fan();
        fan2.setOn(true);
        fan2.setSpeed(Fan.FAST);
        fan2.setcolor("yellow");
        fan2.setRadius(10);
       
        System.out.println(fan2.toString());
        
    }

}
