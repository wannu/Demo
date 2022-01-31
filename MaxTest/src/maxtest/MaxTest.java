

package maxtest;

import java.util.Scanner;

/**
 *
 * @author Nene Wann
 */
public class MaxTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//get input from user
        
        MaxNum max1=new MaxNum();//invoke the no argument construction
        
        System.out.println("Enter the first integer number");
        int num1=sc.nextInt();//first number from user input
        System.out.println("Enter the second integer number");
        int num2=sc.nextInt();//second number from user input
        System.out.println("Enter the third integer number");
        int num3=sc.nextInt();//third number from user input
        
        MaxNum max2=new MaxNum(num1,num2,num3);//invoke the argument constructor    
        System.out.println("\n-The first number= "+max2.getNum1());
        System.out.println("-The second number= "+max2.getNum2());
        System.out.println("-The third number= "+max2.getNum3());
        System.out.println("-The maximum number out of the three= "+max2.MaxNumber());
        System.out.println("\nEnd of program");
        System.out.println("Thank you");
        
        
        
    }

}
