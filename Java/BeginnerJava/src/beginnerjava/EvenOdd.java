
package beginnerjava;

import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter Any Positive Integer: ");
        num=input.nextInt();
        if(num%2==0)
        {
            System.out.println("The Number Is Even");
        }
        
        else
        {
            System.out.println("The Number Is Odd");
        }
       
       
       
    }
    
}
