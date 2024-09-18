import java.util.Arrays;
import java.util.Scanner;
/*// Java program to design HashMap
import java.io.*;
import java.util.*;

class MyHashMap {
	int[] mapArray;
	public MyHashMap()
	{
		mapArray = new int[1000001];
		Arrays.fill(mapArray, -1);
	}

	public void put(int key, int value)
	{
		mapArray[key] = value;
	}

	public int get(int key) { return mapArray[key]; }

	public void remove(int key) { mapArray[key] = -1; }

}
*/
class HasMap
{
     int []maparr;
     public HasMap()
     {
        maparr=new int[100000001];
        Arrays.fill(maparr,-1);
     }
     public void put(int key,int value)
     {
        maparr[key]=value;
     }
     public int get(int key)
     {
        return maparr[key];
     }
     public void remove(int key)
     {
        maparr[key]=-1;
     }
}
public class p19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        HasMap h=new HasMap();
        h.put(1,1);
        h.put(2,3);
        System.out.println(h.get(1));
        System.out.println(h.get(2));
        h.remove(2);
        System.out.println(h.get(2));
        scan.close();
    }    
}
