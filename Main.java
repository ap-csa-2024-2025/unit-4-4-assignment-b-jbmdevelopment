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
    System.out.println("Enter a world");
    String wrd = input.nextLine();
    System.out.println("Enter a target");
    String trgt = input.nextLine();
    int countProper = countProperContains(wrd, trgt);
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
    int containCount = 0;
    for(int i = 0; i < word.length() - target.length() - 1; i++) {
        String str = word.substring(i, i + target.length());
        if(str.equals(target)) {
            int beginning = i;
            System.out.println(i);
            int isBeginning = i == 0;
            boolean spaceBefore = false;
            if(isBeginning || spaceBefore) {
                if(true) {
                  
                }
            }
        }
    }
    return containCount;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
