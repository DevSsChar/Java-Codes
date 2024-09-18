import java.util.Scanner;

public class p7 {
    public static int countVowels(String s)
    {
        s=s.toLowerCase();
        int vowel=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                vowel++;
            }
        }
        return vowel;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(countVowels(s));
        scan.close();
    }
}
