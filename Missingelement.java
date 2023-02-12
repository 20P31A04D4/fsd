import java.util.*;
public class Missingelement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Missing elements in array:");
        for(int i=0;i<n-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])>1)
            {
                 System.out.print((arr[i]+1)+" ");
            }
        }
        sc.close();
    }
}