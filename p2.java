import java.util.*;
public class p2 {
    public static List<String> auto(List<String>s,String q)
    {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<s.size();i++)
        {
            if(s.get(i).startsWith(q))
            {
                ans.add(s.get(i));
            }
        }
         return ans;
    }
    public static void main(String[] args) {
        List<String>s=new ArrayList<>();
        s.add("dog");
        s.add("deer");
        s.add("deal");
        Scanner scan=new Scanner(System.in);
        String q=scan.nextLine();
        List<String>ans=auto(s,q);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
        scan.close();
    }
}
