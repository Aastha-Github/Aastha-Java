public class switchcase {
       public static void main(String[]args) {
              int day = 7;
              switch (day) {
//break keyword is used because it breaks out of switch block. This will stop the execution of more codes and case testing inside the block.
              case 1:
              System.out.println("Monday");
              break;
              case 2:
              System.out.println("Tuesday");
              break;
              case 3:
              System.out.println("Wednesday");
              break;
              case 4:
              System.out.println("Thrusday");
              break;
              case 5:
              System.out.println("Friday");
              break;
              case 6:
              System.out.println("Saturday");
              break; 
              case 7:
              System.out.println("Sunday");
              break;
              default:
              System.out.println("Looking forward to the weekend");              
//default statement is used as the last statement in a switch block, it does need any break.
      }       
  }      
}
