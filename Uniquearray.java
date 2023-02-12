import java.util.Scanner;
import java.util.Arrays;
public class Uniquearray
{
   public static void funique(int a[])
   {
       for(int i=0;i<a.length;i++)
        {
            boolean isunique=false;
            for(int j=0;j<i;j++)
            {
               if(a[i]==a[j])
               {
                  isunique=true;
                  break;
                }
             }
              if(!isunique)
               {
                 System.out.println(a[i]+" ");
                }
         }
      }
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of elements");
        int n=sc.nextInt(); 
        System.out.println("Enter the elements of the array ");   
        int arr[]=new int[n]; 
        for(int i=0; i<n;i++)     
        {
          arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        funique(arr);
        sc.close();
      }
 }
     

     