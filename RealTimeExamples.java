
import java.util.Scanner;

class Student
{
     String name;
      String cname;
       long phone;
        String email; 
        String degree;
         public Student(String name, String cname, long phone, String email, String degree)
          {
             this.name = name;
              this.cname = cname; 
               this.phone = phone; 
                this.email = email;
                 this.degree = degree; 
               } 
               public Student(String name, String cname, String email, String degree)
                {
                    this.name = name; 
                     this.cname = cname;
                      this.email = email;
                       this.degree = degree; 
                } 
                public Student(String name, String cname, long phone, String degree)
                 { 
                    this.name = name;
                     this.cname = cname; 
                      this.phone = phone;
                       this.degree = degree;
                 } 
                 void viewStudentDetails()
                 {
                  System.out.println(); 
                   System.out.println("-----Student Details------");
                    System.out.println(); 
                     System.out.println("Name: " + this.name);
                      System.out.println("Phone Number: " + this.phone);
                       System.out.println("Email ID: " + this.email); 
                        System.out.println("Course Name: " + this.cname);
                         System.out.println("Degree: " + this.degree); 
                }
                 public void setPhone(long phone)
                  { 
                    this.phone = phone; 
                  }
                 public void setEmail(String email)
                  {
                 this.email = email;
                  }
}
               public class RealTimeExamples 
               {  public static void main(String[] args)
                { 
                Scanner sc = new Scanner(System.in);
                 System.out.println(" Enter 1 to register using phone");
                  System.out.println(" Enter 2 to register using Email"); 
                   System.out.println(" Enter 3 to register using both phone and email");
                 int ip = sc.nextInt();
                  switch(ip)
                  { 
                    case 1: 
                    { 
                        System.out.println("Enter you Name ");
                         String name = sc.next();
                          System.out.println("Enter your Course Name ");
                           String cname = sc.next();
                            System.out.println("Enter your Phone ");
                             long phone = sc.nextLong(); 
                              System.out.println("Enter your Degree "); 
                               String degree = sc.next(); 
                                Student s1 = new Student(name, cname, phone, degree);
                                 s1.viewStudentDetails();
                               break;
                     }
                      case 2:
                      { 
                        
                        System.out.println("Enter you Name ");
                         String name = sc.next();
                          System.out.println("Enter your Course Name "); 
                           String cname = sc.next();
                            System.out.println("Enter your Email "); 
                             String email = sc.next(); 
                              System.out.println("Enter your Degree ");
                               String degree = sc.next();
                                Student s1 = new Student(name, cname, email, degree); 
                                 s1.viewStudentDetails(); 
                               break; 
                      } 
                      case 3:
                      { 
                        System.out.println("Enter you Name "); 
                         String name = sc.next();
                          System.out.println("Enter your Course Name "); 
                           String cname = sc.next();
                            System.out.println("Enter your Phone "); 
                             long phone = sc.nextLong(); 
                              System.out.println("Enter your Email ");
                               String email = sc.next(); 
                                System.out.println("Enter your Degree "); 
                                 String degree = sc.next();
                                  Student s1 = new Student(name, cname, phone, email, degree); 
                                   s1.viewStudentDetails(); 
                                 break;
                      }
                } 
        sc.close(); 
     }
}