import java.util.*;
public class p16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=scan.nextLine();
        }
        System.out.println(LCP(str));
        scan.close();
    }
    public static String LCP(String str[])
    {
        Arrays.sort(str);
        String first=str[0];
        String second=str[str.length-1];
        int idx=0;
        while(idx<first.length() && idx <second.length())
        {
            if(first.charAt(idx)==second.charAt(idx))
            {
                idx++;
            }
            else{
                break;
            }
        }
        return first.substring(0,idx);
    }
}
