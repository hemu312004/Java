import java.util.Scanner;

public class inverted {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=4;

for(int i=1;i<=n;i++) //space
{
  for(int j=1;j<=n-1;j++)
  {
    System.out.print(" ");
  }
  //STAR
  for(int j=1;j<=i;j++)
  {
    System.out.print("*");
  }
     System.out.println();// to keep them in the required pattern 

}
    }
}
