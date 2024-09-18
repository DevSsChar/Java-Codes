import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(decodeWays(s));
        scan.close();
    }
    public static int decodeWays(String s)
    {
        int n=s.length();
        int res[]=new int[n+1];
        res[0]=1;
        res[1]=s.charAt(0)=='0'?0:1;
        for(int i=2;i<=n;i++)
        {
            int ones=Integer.valueOf(s.substring(i-1,i));
            int two=Integer.valueOf(s.substring(i-2,i));
            if(ones>=1)
            {
                res[i]+=res[i-1];
            }
            if(two>=10 && two<=26)
            {
                res[i]+=res[i-2];
            }
        }
        return res[n];
    }
}
