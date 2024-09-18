import java.util.HashMap;
import java.util.Scanner;
public class p1{
    public static int kstring(String s,int k)
    {
        HashMap<Character,Integer>map=new HashMap<>();
         int ans=-1;
         int i=-1;
         int j=-1;

         while(true)
         {
            boolean flag1=false;
            boolean flag2=false;
            while(i<s.length()-1)
            {
                 flag1=true;
                 i++;

                 char ch=s.charAt(i);
                 map.put(ch,map.getOrDefault(ch, 0)+1);

                 if(map.size()<k)
                 {
                    continue;
                 }
                 else if(map.size()==k)
                 {
                     int len=i-j;
                     ans=Math.max(ans,len);
                 }
                 else
                 {
                    break;
                 }
            }
            while(j<i)
            {
                flag2=true;
                j++;

                char ch=s.charAt(j);

                if(map.get(ch)==1)
                {
                    map.remove(ch);
                }
                else
                {
                    map.put(ch,map.get(ch)-1);
                }

                if(map.size()==k)
                {
                    int len=i-j;
                     ans=Math.max(ans,len);
                     break;
                }
                else if(map.size()>k)
                {
                    continue;
                }
            }
            if(flag1==false && flag2==false)
            {
                break;
            }
         }
         return ans;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        String s=scan.nextLine();
        int ans=kstring(s, k);
        System.out.println(ans);
        scan.close();
    }
}