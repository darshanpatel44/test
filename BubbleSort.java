import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.Random;
class Bubblesort
{
 void bubblesort( int arr[] )
 {
  int n=arr.length;
  int flag=0;
    for(int k=0;k<n-1;k++)
    {
        for(int i=0;i<n-k-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;;
                flag=1;
                if (flag==0)
            break; 

            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        }
        
    }
    }
 static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
    // Driver method
    public static void main(String[] p)
    {
    int i;
    int []arr= new int[1000];
    Random ru= new Random();
    for(i=0;i<1000;i++)
    {
        arr[i]=ru.nextInt(1000)+1000;
    }
    Bubblesort ob = new Bubblesort(); 
        long starttime=System.nanoTime();
        ob.bubblesort(arr); 
        long endtime=System.nanoTime();                          
        printArray(arr); 
        long timeelapsed=(endtime-starttime);
        System.out.println(starttime);
        System.out.println(endtime);
        System.out.println(timeelapsed);
    }
}
