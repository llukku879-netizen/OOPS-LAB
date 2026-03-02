import java.util.Scanner;

class Student {
 String name;
 int rollno;
 float mark1,mark2,mark3;
 float total,average;
  
  void getData() {
   Scanner sc =new Scanner(System.in);
   
   System.out.print("Enter Name:");
   name=sc.nextLine();
   
   System.out.print("Enter roll number:");
   rollno =sc.nextInt();
   
   System.out.print("Enter 3 marks:");
   mark1 =sc.nextFloat();
      mark2 =sc.nextFloat();
         mark3 =sc.nextFloat();
   
   }
   
   void calculate() {
    total=mark1+mark2+mark3;
    average =total/3;
    }
 void display() {
  System.out.println("Name:" + name);
    System.out.println("Roll no:" + rollno);  System.out.println("Total:" + total);
      System.out.println("Average:" + average);
      }
      
  public static void main(String[] args){
  Student s= new Student();
  s.getData();
  s.calculate();
  s.display();
  }
  }
    
 
