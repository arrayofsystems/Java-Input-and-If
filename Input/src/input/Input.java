//This is a sigle line comment

/*
This is a multi line comment
*/

package input;
import java.util.Scanner; // Allows the user to input data 

public class Input {

    public static void main(String[] args) {
      // The vairable "input" makes the scanner usable in the program
       Scanner input = new Scanner(System.in);  
   
       //Prompts the user for choices 
       System.out.println("Hello how are you?");
       System.out.println("Choose from the following (case sensitive)");
       System.out.println("good");
       System.out.println("swell");
       System.out.println("excellent");
       System.out.println("bad");
       System.out.println("badly");
       System.out.println("terrible");       
       String response = input.nextLine();

       // || = or && = and ! = not
       //If the user chooses "good", "swell", or "excellent" 
       if (response.equals ("good") || response.equals ("swell") || response.equals ("excellent")){
        System.out.println("That's just " + response);
    }
       //What about the "bad" choices?
       else if (response.equals ("bad") || response.equals ("badly") || response.equals ("terrible")){
        System.out.println("Things are going " + response  + " for you.");
    }
       //If the response does not match 
       else {
          System.out.println("Try again");

       }

       
    }
    

 
}



/*
https://stackoverflow.com/questions/10924561/java-scanner-string-input-if-statement-not-working
*/
