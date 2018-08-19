/*NUMBER PATTERN:333
                 233
                 123




import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		
Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i, j, k;
  for(i=n;i>=1;i--)
  {
    k = i;
    for(j=1;j<=n;j++)
    {
      if(k <= n)
      {
        System.out.print(k);
      }
      else
      {
         System.out.print(n);
      }
      k++;
    }
   System.out.println();

  }
	}

}
