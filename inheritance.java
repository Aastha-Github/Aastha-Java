package oops;
public class inheritance {
    public static void main(String[]args){
       mult o1= new mult();
          o1.div(); 
          o1.multiply();
 }             
              
}
class parentclass{
              int a, b, c;
              public void div(){
          a=5;
          b=25;
          c=b/a;
        System.out.println("result="+c);}      
}
class mult extends parentclass{
              
     public void multiply(){         
      c= a*b;
     System.out.println("result="+c); 
} 
   
}               