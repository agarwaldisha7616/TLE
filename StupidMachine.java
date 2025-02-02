import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] capacity=new int[n];
		    for(int i=0;i<n;i++){
		        capacity[i]=sc.nextInt();
		    }
		    
		    long ans=0, mincapactiy=Integer.MAX_VALUE;
		    for(int i=0;i<n;i++){
		        mincapactiy=Math.min(mincapactiy,capacity[i]);
		        ans+=mincapactiy;
		    }
		    System.out.println(ans);
		    
		}

	}
}
