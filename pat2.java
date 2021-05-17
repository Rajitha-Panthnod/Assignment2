import java.util.Scanner;
class pat2
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int r=sc.nextInt();
   int i,j,k;
   for(i=1;i<=r;i++)
    {
      for(j=i;j<=r;j++)
      {
         System.out.print(" ");
       }
        for(k=1;k<=(2*i-1);k++)
         {
           if(k==1 || i==r || k==(2*i-1))
            {
             System.out.print("*");
             }
            else
            {
             System.out.print(" ");
            }
          }
            System.out.println(" ");
      }
    }
}