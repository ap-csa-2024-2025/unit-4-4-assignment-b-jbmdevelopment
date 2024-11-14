import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // problem 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String sentence = input.nextLine();
    System.out.println("Enter a target (word) to find in the sentence");
    String target = input.nextLine();
    int counter = countSub(sentence, target);
    System.out.println(target + " appears " + counter + " times");

  }

  public static int countSub(String word, String target)
  {
  int counter = 0;
  for(int i = 0; i < word.length() - target.length() - 1; i++) {
      String str = word.substring(i, i + target.length());
      if(str.equals(target)) {
            counter++;
       }
    }
    return counter;
  }

  public static int countProperContains(String word, String target)
  {
    return 0;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
