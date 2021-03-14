package oops;
import java.util.ArrayList;

public class lamdaexp {
         public static void main(String[]args) {
              ArrayList<Integer>
              numbers = new ArrayList<Integer>();
              numbers.add(10);
              numbers.add(9);
              numbers.add(8);
              numbers.add(7);
              numbers.forEach( (n) -> {System.out.println(n);});        
             }    
}

