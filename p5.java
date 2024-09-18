import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println(firstMissingPositive(arr));
        scan.close();
    }
    public static int firstMissingPositive(int arr[])
    {
        Arrays.sort(arr);
        int n=arr.length;
        int i=1;
        for(int j=0;j<n;j++)
        {
            if(arr[j]<0)
            {
                continue;
            }
            if(arr[j]==i)
            {
                i++;
            }
            else if(arr[j]>i)
            {
                break;
            }
        }
        return i;
    }
}
