
package beginnerjava;

import java.util.Scanner;

public class LogicalOR {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        char c;
        System.out.print("Take A letter: ");
        c=input.next().charAt(0); //Saif(s=0)
        
     if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
    {
        System.out.println("vowel");
        
    }
     else{System.out.println("Consonant");}
    
}
}
