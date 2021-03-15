
package array_demo;

import java.util.ArrayList;


public class Arraaylist1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number= new ArrayList<>();
        System.out.println("Size =" +number.size());
        
        number.add(10);
        number.add(40);
        number.add(30);
        number.add(3, 60);
        
       // System.out.println(number);
       for(int x : number){
        System.out.print(" " +x );}
        System.out.println("");
        System.out.println("Size= "+number);    
    }   
    
}
                