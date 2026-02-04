import java.util.*;

class bit_magazine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            double sum = (n * (n + 1)) / 2;
            int f = sc.nextInt();
            int leaves = (n + 1) / 2;
            while(f-->0) {
                sum -= (double) sc.nextInt();
            }
            int torn = sc.nextInt();
            int rem = leaves - torn;
            sum = (sum * rem) / leaves;
            System.out.printf("%.4f", sum);
            System.out.println();
        }
	}
}
