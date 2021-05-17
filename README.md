# Assignment2

These program realated to a business logic and real entity In Project we have to done on java programing language first we can thing how to implement our application and what are the methods and varaibles required and come with our logic implement the our project first we have take class and declare the all varaibles and methods varaibles like name,designation, salary,age and methods are create,display,salaryraise In these we can read the all the name,age,salary desiganation, and by using the methods we can implement the our project Every time execution start from main method and step by step we go through and compile and execute the our promgram successfully In these first we have take the all properties like varaibles such as

String name; String designation; double salary; int age;

In these Aplication behaviours such as methods are create(),display(),salaryraise() In these program we can call methods dynamically that's way we have to write the Scanner class import the scanner class like import java.util.Scanner; And next we have to create the Scanner class object like Scanner sc=new Scanner(System.in); The methods are like follows such as

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
In these above method we enter the name,age,salary,designation,and call to them dynamically by using Scanner class object

Diplay all those values by using display method like as

       public void display()
        {
         System.out.println("\nName:"+name);
         System.out.println("Age:"+age);
         System.out.println("salary:"+salary);
         System.out.println("designation:"+designation);
         }
By using display method we print the values like name, age, salary, designation.

In given program every time we increase our salary that's way we have another method that is

      public void salaryraise()
                {
                  salary=salary+1000;
                  System.out.println("salary raised by 1000");
                 }
By using salaryraised(); we can increase our salary each time

Next we have to create another class that is Emp1 In these we have to write main method

         public static void main(String args[]);
every program execution starts from main method we can execute step by step

Next we have to create the object like

Emp e=new Emp();
 
By using object references we call all methods. Next we can write the do while loop for iteration purpose

     System.out.println("Enter Total Number of Employees:");
     size=sc.nextInt();
     String[] Empnames=new String[size];
     for(int i=0;i<size;i++)
     {
     System.out.println("Enter the name of the employee"+(i+1));
     Empnames[i]=sc.next();
     }

The above code we can how many number of employees you want i your choice you enter the total number of emplyoees.
By using arrays concept we can execute the progaram.

      do
       {
       Scanner sc=new Scanner(System.in); 
       System.out.println("\n1.Create:");
       System.out.println("2.Display:");
       System.out.println("3.Salary raised:");
       System.out.println("4.exit:");
       System.out.println("Enter your choice:");
       k=sc.nextInt();
       
       
       switch(k)
       {
        case 1: e.create();
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
By using do while loop we continue the iterations how many you want it is our choice and by choose choice exit then only we can exit.based on our choice we execute our program step by step complete and executed successful.

