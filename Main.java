import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // problem 
    Scanner input = new Scanner(System.in);
    int counter = 0;
    System.out.println("Enter a sentence");
    String sentence = input.nextLine();
    System.out.println("Enter a target (word) to find in the sentence");
    String target = input.nextLine();
    for(int i = 0; i < sentence.length() - target.length() - 1; i++) {
        String str = sentence.substring(i, i + target.length());
        if(str.equals(target)) {
            counter++;
        }
    }
    System.out.println(target + " appears " + counter + " times");
    
  }

  public static int countSub(String word, String target)
  {
    return 0;
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
