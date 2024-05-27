import java.util.*;
public class functions {
    

   /* *public static int calsum(int a,int b)
    {
       // int sum=a+*b;
       int mul=a*b;
       // System.out.println(sum);
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //String name= sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int mul= calsum(a,b);
        System.out.println(mul);
/* */

public static void factorial(int n)
{
    int fact=1;
    for(int i=n; i>=1 ;i--)
    {
     fact=fact*i;


}
System.out.println(fact);
return ;
}

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    factorial(n);

}
}

