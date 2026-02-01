import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.PrintWriter;  
class prime_query
{
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long[] zero = new long[n];
            long[] one = new long[n];
            for(int i = 0; i < n; i++){
                if(arr[i]==0) zero[i]=1;
                else if(arr[i]==1) one[i]=1;
                if(i>0){
                    zero[i]+=zero[i-1];
                    one[i]+=one[i-1];
                }
            }

            int q = Integer.parseInt(br.readLine());
            for(int i=0;i<q;i++){
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken()) - 1;
                int r = Integer.parseInt(st.nextToken()) - 1;

                long x = zero[r] - (l > 0 ? zero[l-1] : 0);
                long y = one[r] - (l > 0 ? one[l-1] : 0);
                long len = r - l + 1;

                long total = len*(len-1)/2;
                long invalid = x*(x-1)/2 + x*y;
                long valid = total - invalid;

                out.println(valid);
            }
        }

        out.flush();
        out.close();
    
    }
}
