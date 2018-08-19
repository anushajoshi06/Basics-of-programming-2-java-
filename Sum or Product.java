/*Write a program that asks the user for a number N and a
 choice C. And then give him the possibility to choose between
 computing the sum and computing the product of 1 ,..., N.
*/



import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int result=1;
		if( x==1){
		int sum=n*(n+1)/2;
		System.out.print(sum);
		}
		else if(x==2){
			for (int i=1;i<=n;i++){
				result=result*i;
			}
			System.out.println(result);
		}
		else{
			System.out.println(-1);
		}
		
		}
		
	
	
	
	
	
	
	
			
		
	
	

	
}
