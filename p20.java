import java.util.Scanner;

public class p20 {
    public static int binarySearch(int arr[],int key)
    {
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(s<=e)
        {
            if(arr[mid]==key)
            {
                return mid;
            }
            if(key>arr[mid])
            {
                s=1+mid;
            }
            else
            {
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int key=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println(binarySearch(arr,key));
        scan.close();
    }
}
