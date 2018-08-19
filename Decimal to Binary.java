import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s= new Scanner(System.in);
  int n=s.nextInt();
      convertBinary(n);
	}
   public static void convertBinary(int num){
     int binary[] = new int[40];
     int index = 0;
     while(num > 0){
       binary[index++] = num%2;
       num = num/2;
     }
     for(int i = index-1;i >= 0;i--){
       System.out.print(binary[i]);
     }
}
}