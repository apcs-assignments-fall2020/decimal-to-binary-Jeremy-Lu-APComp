//Binary to Decimal-- Jeremy Lu -- AP Computer Science
import java.util.Scanner;
class MyMain {
 
public static int binaryToDecimal(String binaryStr){
    int binary = Integer.parseInt(binaryStr);
 
    int fin_val = 0; // initiallizes val
    int a = 0; // initializes power
    while (true) {
        if (binary == 0){

            break; // If program detects "0", the code breaks (continues to iterate through other variables)
      } 
        else {
          int val = binary%10; //extracts the last digit of inputted value
          fin_val += val*Math.pow(2, a); //completes the formula for calculating dec digits at certain binary values
          binary = binary/10; //reduces inputted value per power (ex: 111 becomes 11)
          a+=1; //adds 1 to each power
       }
    }
    return fin_val; //returns the final decimal
  }
 
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    // String str = scan.next();
    System.out.println("Please input a binary value: "); //prompts user to input binary value
    String user_input = scan.next();
    System.out.println("Decimal representation of inputted binary value: " + binaryToDecimal(user_input));
  } //outputs user friendly message
}