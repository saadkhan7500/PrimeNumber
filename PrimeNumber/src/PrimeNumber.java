import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			if(isPrime(ar[i]))
			System.out.print(ar[i]+" ");
		}
	}
	
	
}
