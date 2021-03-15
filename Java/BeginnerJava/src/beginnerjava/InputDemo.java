
package beginnerjava;

import java.util.Scanner;

public class InputDemo {
  
    public static void main(String[] args) 
    {
        /*Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter any number:");
       number= input.nextInt();
        
        System.out.println("Number ="+number);
        */
        
        Scanner input = new Scanner(System.in);
        String name;
        
        System.out.println(":enter your name:");
        name= input.nextLine();
        
        System.out.println("welcome:"+name);
        
    }
}
