
package beginnerjava;

import java.util.Scanner;
public class LogicalAnd {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        char c;
        System.out.print("Take A letter: ");
        c=input.next().charAt(0); //Saif(s=0)
        
    if(c>='a' && c<='z')
    {
        System.out.println("Small latter");
    }
    else
    {
        System.out.println("CAPITAL");
    }
}
}
