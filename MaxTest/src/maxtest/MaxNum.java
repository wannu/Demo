/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maxtest;

/**
 *
 * @author wannu
 */
public class MaxNum {
    int num1;
    int num2;
    int num3;
    public MaxNum() //no argument constructor
    {
     this.num1=1;
     this.num2=2;
     this.num3=3; 
     //default values
    }
    
    public MaxNum(int num1, int num2, int num3) //argument constructor
    {
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }
    public int getNum1() //accessor for number1
    {
        return this.num1;//return the first numer
    }
    
    public int getNum2() //accessor for number2
    {
        return this.num2;//return the second number 
    }
    public int getNum3()//accessor for num3
    {
        return this.num3;//return the third number
    }
    public int MaxNumber() //maximum number condition
    {
        int max=0;
        if(num1>num2 && num1>num3)
        {
            max=this.num1;//if true the maximum number is num1
           
        }
        else if(num2>num1 && num2>num3)
        {
            max=this.num2;//if true the maximum number is num2
        }
        else if(num3>num1 && num3>num2)
        {
           max=this.num3;//if true the maximum number is num3       
        }
        else{
            System.out.println("You enterred a wrong data type");
          }
         return max;//return the max number in any case
    }
    
    
    
    
    
    
    
}
