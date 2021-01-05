import java.util.*;
public class MakeStars {
  public static void main( String[] args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      String word;
      while (n.hasNextLine()) {
        Scanner line = new Scanner (n.nextLine());
        while (line.hasNext()) {
          word = line.next();
           // System.out.print(word);
           // System.out.print(word.length());

          for (int i = 0; i < word.length(); i ++) {
            System.out.print("*");
          }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
