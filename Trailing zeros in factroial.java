import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
System.out.println(getTrailing0InFactorial(num));
	}
  public static int getTrailing0InFactorial(int num) {
  if(num<0)
   return -1;
    
  int count = 0;
  for (int i = 5; (num/i) > 0; i=i*5) {
   count = count + num/i;
  }
  return count;
 }
}
