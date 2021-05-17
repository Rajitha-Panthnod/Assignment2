import java.util.Scanner;
class Emp
{
  String name;
  String designation;
  double salary;
  int age;
        Scanner sc=new Scanner(System.in);
          public void create()
          {
           System.out.println("\nEnter name:");
           name=sc.next();
           System.out.println("Enter age:");
           age=sc.nextInt();
           System.out.println("Enter salary:");
           salary=sc.nextInt();
           System.out.println("Enter designation:");
           designation=sc.next();
          }
         public void display()
            {
             System.out.println("\nName:"+name);
             System.out.println("Age:"+age);
             System.out.println("salary:"+salary);
             System.out.println("designation:"+designation);
             }
   
       public void salaryraise()
                    {
                      salary=salary+1000;
                      System.out.println("salary raised by 1000");
                     }
  }
class Emp1
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     Emp e=new Emp();
     int size;
     System.out.println("Enter Total Number of Employees:");
     size=sc.nextInt();
     String[] Empnames=new String[size];
     for(int i=0;i<size;i++)
     {
     System.out.println("Enter the name of the employee"+(i+1));
     Empnames[i]=sc.next();
     }
     boolean b=false;
     int k;
        do
          {
           System.out.println("\n1.Create:");
           System.out.println("2.Display:");
           System.out.println("3.Salary raised:");
           System.out.println("4.exit:");
           System.out.println("Enter your choice:");
           k=sc.nextInt();
           switch(k)
           {
            case 1:e.create();
                    b=true;
                    break;
            case 2:if(b)
                   e.display();
                   else System.out.println("No Records...!"); 
                   break;
            case 3:if(b)
                   e.salaryraise();
                   else System.out.println("No Records...!"); 
                   break;
            case 4:System.out.print("Exiting..!");
                    break;
            default: System.out.println("No Action...!"); 

            }
       }while(k!=4);
     
    
    }
}
    
           
           