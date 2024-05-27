import java.util.Scanner;

public class bitmanipulation {
    

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
//int n=sc.nextInt();
int i=sc.nextInt();
int o=sc.nextInt();
// BIT MASK
    //int n=5;//0101=4bit
    //int i=3;2

  //  int bitmask=1<<i;
   // if((bitmask& n)==1)// logical  And
   // {
    //    System.out.println("1");
   // }
    // else
  //  {
  //      System.out.println("0");
 
   // }
//SET MASK
    int setmask=1<<i;
    int newnumber= setmask|o;
   // System.out.println(newnumber);

//CLEARBIT
int clearbit=1<<i;
int notnumber= ~(clearbit);
int newclear= notnumber& o;

//System.out.println(newclear);

  //updatebit

  int oper=sc.nextInt();//oper=0 :clear 1 set
  

  if(oper==1){
    int updatebit=1<<i;
    int newupdate=updatebit |o;
    System.out.println(newupdate);


  }

  else
  {
    int newupdatebit= ~(1<<i);
     int f= newupdatebit & o;
     System.out.println(f);

  }





}
}
