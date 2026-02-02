import java.util.*;
import java.lang.*;
import java.io.*;

class random_pair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=in.nextInt();
		    }
		    int max1=-1,max2=-1;
		    for(int val:arr){
		        if(val>max1){
		            max2=max1;
		            max1=val;
		        }
		        else if(val>max2){
		            max2=val;
		        }
		    }
		    long total=(long)(n*(n-1)/2);
		    int c1=0,c2=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]==max1) c1++;
		        if(arr[i]==max2) c2++;
		    }
		    long pair;
		    if(c1>=2){
		        pair=(long)(c1*(c1-1)/2);
		    }
		    else{
		        pair=(long)(c1*c2);
		    }
		    System.out.printf("%.8f\n",(double)pair/total);
		}
	}
}
