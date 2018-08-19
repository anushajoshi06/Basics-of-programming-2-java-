import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

	Scanner s=new Scanner(System.in);
	int r,a,num=0,n=0;
	a=s.nextInt();
	n=0;
	while(a>0){
		r=a%10;
	
	num+=(int)(Math.pow(2,n))*r;
	n++;
	a=a/10;
    }
	System.out.print(num);
    
	
	

}
}	

