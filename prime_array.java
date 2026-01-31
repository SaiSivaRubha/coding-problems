
import java.util.*;
class prime_array {
    public static boolean isPrime(long n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
    return true;
    } 
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0){
            int N=in.nextInt();
            long[] arr=new long[N];
            for(int i=0;i<N;i++){
                arr[i]=in.nextLong();
            }
            long ones=0,primes=0;
            for(int i=0;i<N;i++){
                if(arr[i]==1) ones++;
                else if(isPrime(arr[i])) primes++;
            }
            long total=(ones*(ones-1))/2*primes;
            System.out.println(total);
        }
    }
}
