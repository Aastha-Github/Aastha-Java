package oops;

public class constructoroverloadinginjava {// Overloading:-Constructor name is same but Parameters are different
              constructoroverloadinginjava(int a, int b) {
                  int c = a + b;
                  System.out.println(c);
          
              }
          
              constructoroverloadinginjava(int i, int j, String f) {
                  int k = i * j;
                  System.out.println(f + k);
          
              }
          
              public static void main(String[] args) {
                  constructoroverloadinginjava o1 = new constructoroverloadinginjava(4, 8);
                  constructoroverloadinginjava o2 = new constructoroverloadinginjava(5, 12, "Multiplication=");
              }
          
          }
          

              

