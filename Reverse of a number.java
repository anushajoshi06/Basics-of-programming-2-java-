import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
	
		
			
			Scanner s =new Scanner(System.in);
			int number,remainder,reverse=0;
			number=s.nextInt();
			while(number>0){
				remainder=number%10;
				reverse=reverse*10+remainder;
				number=number/10;
				
				
				
			}
	System.out.println(reverse);
		}
	}

