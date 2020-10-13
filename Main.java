/**
 * This program creates a method named allDigitsOdd that returns whether every digit of a positive integer is odd. 
 * @author Dafna Khripun
 */
public class Main {
   
  // creating a methos that turnes whether every digit of a positive integer is odd
   public static boolean allDigitsOdd( int integerStarting){

    // define the starting integer as integer
    int integer = integerStarting;

    // "isolating" the digits using a while loop
    while (integer > 10){

      // the remainder of the last digit neets to be determined of wether it is odd or even 
      int isolatedDigit = integer % 10;
      int evenOrOddLastDigit = isolatedDigit % 2;
      if (evenOrOddLastDigit == 0){
        return false;
      }
      // determine wether the next "isolated integer" is even or odd by dividing in 10 and goint into the loop again
      integer = integer / 10;
    }
    return true;
  }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    // define the starting integer 
    boolean integer = allDigitsOdd(57931);

    // print wether all integers are odd or not
   System.out.println(integer);
  }
}
