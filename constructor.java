package oops;

public class constructor {
               /*
     * Constructor similar to method but Constructor name & class name both are same
     * Constructor is called at the time we create an object. It allocates memory
     * for the object. It is a special type of method used to initialize the object.
     * type of constructor:-Default(No P), Parameterised , Constructor name & class
     * name are same. No return type cannot be abstract , static, final
     * 
     * 
     * 
     */
    constructor() {// default
              System.out.println("Default Constructor");
          }
      
          public static void main(String[] args) {
              constructor o1 = new constructor();
          }
      }
      
              
