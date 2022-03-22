
import java.util.Scanner;

/**
 * XP-8
 * @author Tonmoy
 */
public class PromptString {

    public static void main(String[] args) {
                  
      double vowels_count, consonants_count;
      String sentence;
      vowels_count = 0;
      consonants_count = 0;
      double count = 0;
      Scanner input = new Scanner(System.in);
  
      System.out.println("Enter a String: ");
      sentence = input.nextLine();
      sentence = sentence.toLowerCase();
      for (int i = 0; i < sentence.length(); ++i) {
         char ch = sentence.charAt(i);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            ++vowels_count;
         }
         else 
         if ((ch >= 'a' && ch <= 'z')) {
            ++consonants_count;
            
         }

      }

      System.out.println("The number of vowels: " +String.format("%.0f",vowels_count)+" ("+String.format("%.2f", vowels_count/sentence.length()*100)+"%)");
      System.out.println("The number of consonants: " +String.format("%.0f",consonants_count)+" ("+String.format("%.2f", consonants_count/sentence.length()*100)+"%)");
            
      for (int i=0 ; i<sentence.length(); i++){
         char ch = sentence.charAt(i);
         if(ch == '0'|| ch == '1'|| ch == '2' ||ch == '3' ||ch == '4'||ch == '5'|| ch == '6'|| ch == '7' ||ch == '8' ||ch == '9'||ch == ' '){
            count ++;
         }
      }

      System.out.println("Number of digits: "+String.format("%.0f",count)+" ("+String.format("%.2f", count/sentence.length()*100)+"%)");
    }
    
}
