import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
 Scanner s =new Scanner (System.in);
			int n= s.nextInt();
		int a = 0;
		int b = 1;
		int sum=0;
		
		for (int i=2;i<=n;i++)
	{
	
	sum=a+b;
			a=b;
			b=sum;
        // int temp=sum+b;
        }
			System.out.print(b);
		
	}

}
