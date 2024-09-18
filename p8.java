import java.util.Scanner;

public class p8 {
    public static Boolean palindrome(String s1,int s,int e)
    {
        if(s>=e)
        {
            return true;
        }
        if(s1.charAt(s)==s1.charAt(e))
        {
            return palindrome(s1, s+1, e-1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(palindrome(s,0,s.length()-1));
        scan.close();
    }
}
