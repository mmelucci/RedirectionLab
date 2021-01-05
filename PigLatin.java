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
      s = s.substring(1, s.length()) + s.charAt(0) + "ay";
    }
    return s;
    }

    public static void main (String[] args) {
      System.out.println("PigLatin I Tests:");
      System.out.println("Expected: ockmay");
      System.out.print("Result: ");
      System.out.println(pigLatinSimple("mock"));
      System.out.println();
      System.out.println("Expected: iepay");
      System.out.print("Result: ");
      System.out.println(pigLatinSimple("pie"));
      System.out.println();
      System.out.println("Expected: avidday");
      System.out.print("Result: ");
      System.out.println(pigLatinSimple("david"));
      System.out.println();
      System.out.println("Expected: aaronhay");
      System.out.print("Result: ");
      System.out.println(pigLatinSimple("aaron"));
      System.out.println();
      System.out.println("Expected: uperracecarsay");
      System.out.print("Result: ");
      System.out.println(pigLatinSimple("Superracecar"));
      System.out.println();
    }
  }
