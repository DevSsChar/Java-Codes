import java.util.Scanner;

public class p13 {
    public static String swap(String str,int l,int r)
    {
        char temp;
        char s[]=str.toCharArray();
        temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        return String.valueOf(s);
    }
    public static void permutation(String s,int l,int r)
    {
        if(l==r)
        {
            System.out.println(s);
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                s=swap(s,l,i);
                permutation(s, l+1, r);
                s=swap(s,l,i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        permutation(s,0,s.length()-1);
        scan.close();
    }
}
