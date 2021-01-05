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

      System.out.println("PigLatin II Tests:");
      System.out.println("Expected: ethay");
      System.out.print("Result: ");
      System.out.println(pigLatin("the"));
      System.out.println();
      System.out.println("Expected: eckchay");
      System.out.print("Result: ");
      System.out.println(pigLatin("check"));
      System.out.println();
      System.out.println("Expected: eeskay");
      System.out.print("Result: ");
      System.out.println(pigLatin("skee"));
      System.out.println();
      System.out.println("Expected: emuhay");
      System.out.print("Result: ");
      System.out.println(pigLatin("emu"));
      System.out.println();
      System.out.println("Expected: adegray");
      System.out.print("Result: ");
      System.out.println(pigLatin("grade"));
      System.out.println();
    }
  }
