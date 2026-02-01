import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class confused_monk {
    public static long hcf(long n1,long n2){
        if(n2==0) return n1;
        return hcf(n2,n1%n2);
    }
    public static long power(long x,long n,long mod){
        long res=1;
        while(n>=1){
            if(n%2!=0){
                res=(res*x)%mod;
                n--;
            }
            else{
                x=(x*x)%mod;
                n=n/2;
            }
        }
        return res;
    }
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        long  mod=1000000007;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextLong();
        }
        long gcd=arr[0];
        for(int i=1;i<n;i++){
            gcd=hcf(gcd,arr[i]);
        }
        long pdt=1;
        for(int i=0;i<n;i++){
            pdt=(pdt*arr[i])%mod;
        }
        System.out.println(power(pdt,gcd,mod));
        
    }
}
