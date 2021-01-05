import java.util.*;
import java.lang.Character;
public class PigLatin {
  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if ((s.charAt(0) == 'a') ||
       (s.charAt(0) == 'e') ||
       (s.charAt(0) == 'i') ||
       (s.charAt(0) == 'o') ||
       (s.charAt(0) == 'u')) {
         s = s + "hay";
       }
    else {
      s = s.substring(1) + s.charAt(0) + "ay";
    }
    return s;
    }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    if ((s.charAt(0) == 'a') ||
       (s.charAt(0) == 'e') ||
       (s.charAt(0) == 'i') ||
       (s.charAt(0) == 'o') ||
       (s.charAt(0) == 'u')) {
         s = s + "hay";
       }
    else if ((s.substring(0, 2).equals("bl")) ||
        (s.substring(0, 2).equals("br")) ||
        (s.substring(0, 2).equals("ch")) ||
        (s.substring(0, 2).equals("ck")) ||
        (s.substring(0, 2).equals("cl")) ||
        (s.substring(0, 2).equals("cr")) ||
        (s.substring(0, 2).equals("dr")) ||
        (s.substring(0, 2).equals("fl")) ||
        (s.substring(0, 2).equals("fr")) ||
        (s.substring(0, 2).equals("gh")) ||
        (s.substring(0, 2).equals("gl")) ||
        (s.substring(0, 2).equals("gr")) ||
        (s.substring(0, 2).equals("ng")) ||
        (s.substring(0, 2).equals("ph")) ||
        (s.substring(0, 2).equals("pl")) ||
        (s.substring(0, 2).equals("pr")) ||
        (s.substring(0, 2).equals("qu")) ||
        (s.substring(0, 2).equals("sc")) ||
        (s.substring(0, 2).equals("sh")) ||
        (s.substring(0, 2).equals("sk")) ||
        (s.substring(0, 2).equals("sl")) ||
        (s.substring(0, 2).equals("sm")) ||
        (s.substring(0, 2).equals("sn")) ||
        (s.substring(0, 2).equals("sp")) ||
        (s.substring(0, 2).equals("st")) ||
        (s.substring(0, 2).equals("sw")) ||
        (s.substring(0, 2).equals("th")) ||
        (s.substring(0, 2).equals("tr")) ||
        (s.substring(0, 2).equals("tw")) ||
        (s.substring(0, 2).equals("wh")) ||
        (s.substring(0, 2).equals("wr"))) {
          s = s.substring(2) + s.substring(0, 2) + "ay";
        }
    else {
      s = s.substring(1) + s.charAt(0) + "ay";
    }
    return s;
  }

  public static String pigLatinBest(String s){
    // Given a single word of at least 1 character, that can optionally have a punctuation mark afterwards.
    // Words that start with a NON letter are left alone
    // Otherwise: Same rules as pigLatin() except now there can optionally be punctuation marks at the end of a word.
    // Punctuation is any non-letter, non-number symbol after the word.
    // The punctuation must remain after the word after you convert to pig latin.
    // output should be lower case to avoid issues with capitalization
    if (!Character.isLetter(s.charAt(0))) {
      return s;
    }
    else {
      if (!Character.isLetter(s.charAt(s.length()-1))) {
        return (pigLatin(s.substring(0, s.length()-1)) + s.charAt(s.length()-1));
      }
      else {
        return pigLatin(s);
      }
    }
  }

  // public static void main (String[] args) {
      // System.out.println("PigLatin I Tests:");
      // System.out.println("Expected: ockmay");
      // System.out.print("Result: ");
      // System.out.println(pigLatinSimple("mock"));
      // System.out.println();
      // System.out.println("Expected: iepay");
      // System.out.print("Result: ");
      // System.out.println(pigLatinSimple("pie"));
      // System.out.println();
      // System.out.println("Expected: avidday");
      // System.out.print("Result: ");
      // System.out.println(pigLatinSimple("david"));
      // System.out.println();
      // System.out.println("Expected: aaronhay");
      // System.out.print("Result: ");
      // System.out.println(pigLatinSimple("aaron"));
      // System.out.println();
      // System.out.println("Expected: uperracecarsay");
      // System.out.print("Result: ");
      // System.out.println(pigLatinSimple("Superracecar"));
      // System.out.println();
      //
      // System.out.println("PigLatin II Tests:");
      // System.out.println("Expected: ethay");
      // System.out.print("Result: ");
      // System.out.println(pigLatin("the"));
      // System.out.println();
      // System.out.println("Expected: eckchay");
      // System.out.print("Result: ");
      // System.out.println(pigLatin("check"));
      // System.out.println();
      // System.out.println("Expected: eeskay");
      // System.out.print("Result: ");
      // System.out.println(pigLatin("skee"));
      // System.out.println();
      // System.out.println("Expected: emuhay");
      // System.out.print("Result: ");
      // System.out.println(pigLatin("emu"));
      // System.out.println();
      // System.out.println("Expected: adegray");
      // System.out.print("Result: ");
      // System.out.println(pigLatin("grade"));
      // System.out.println();
      //
      // System.out.println("PigLatin III Tests:");
      // System.out.println("Expected: *emu");
      // System.out.print("Result: ");
      // System.out.println(pigLatinBest("*emu"));
      // System.out.println();
      // System.out.println("Expected: 4chan");
      // System.out.print("Result: ");
      // System.out.println(pigLatinBest("4chan"));
      // System.out.println();
      // System.out.println("Expected: ishfay!");
      // System.out.print("Result: ");
      // System.out.println(pigLatinBest("fish!"));
      // System.out.println();
      // System.out.println("Expected: ishfay");
      // System.out.print("Result: ");
      // System.out.println(pigLatinBest("fish"));
      // System.out.println();
      // System.out.println("Expected: ethay.");
      // System.out.print("Result: ");
      // System.out.println(pigLatinBest("the."));
      // System.out.println();
      // System.out.println("Expected: atcay!");
      // System.out.print("Result: ");
      // System.out.println(pigLatinBest("cat!"));
      // System.out.println();
      // System.out.println("Expected: amazinghay?");
      // System.out.print("Result: ");
      // System.out.println(pigLatinBest("amazing?"));
      // System.out.println();
      // System.out.println("Expected: applehay%");
      // System.out.print("Result: ");
      // System.out.println(pigLatinBest("apple%"));
      // System.out.println();

  public static void main( String[] args ){
      Scanner n = new Scanner( System.in );
      while (n.hasNextLine()) {
        Scanner line = new Scanner (n.nextLine());
        while (line.hasNext()) {
          System.out.print(pigLatinBest(line.next()));
          if (line.hasNext()) {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
}
