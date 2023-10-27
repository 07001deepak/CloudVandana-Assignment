import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char[] charArray = str.toLowerCase().toCharArray();
        int charCount=str.length();
        int alphaCount = 0;
        for(int i=0;i<charCount;i++)
        {
            if(charArray[i]>='a' && charArray[i]<='z')
            alphaCount++;
        }
        if(alphaCount==26)
        System.out.println("The given sentence is Pangram");
        else
          System.out.println("The given sentence is not a Pangram");
        
    }
}