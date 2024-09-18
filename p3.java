import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        System.out.println(sumOfNonAdjacentElements(arr,n));
    }
    public static int sumOfNonAdjacentElements(int arr[],int n)
    {
        int prev1=1,prev2=0;
        for(int num:arr)
        {
            int temp=prev1;
            prev1=Math.max(prev1,prev2+num);
            prev2=temp;
        }
        return prev1;
    }
}
