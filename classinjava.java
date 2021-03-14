package oops;

public class classinjava { 
              /*
               * oops is a way of proramming;1) Encapsulation 2)Inheritance 3)Polymorphism
               * 4)Abstraction:-hiding Complexity; 5)Class & 6)object
               */
              String name = "Shizuka";// Data member
          
              public void fun(String live) {// member function
                  System.out.println(live);
          
              }
          
              public static void main(String[] args) {
                  /*
                   * Class:-Data member:- Variable Memberfunction:-Method/Function to acces the
                   * class we have to create object of class. Classname ObjectName = new
                   * ClassConstructor()
                   * 
                   */
                  classinjava o1 = new classinjava();// object creation
                  System.out.println(o1.name);
                  o1.fun("Lives In DoraLand");
          
              }
          
          }
          

              

