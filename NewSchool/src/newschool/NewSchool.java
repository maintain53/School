/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NewSchool {
 static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("WELCOME TO MYAPP");
      System.out.println("1. Teacher");
      System.out.println("2. Student");
      System.out.println("3. Parent");
       System.out.println("Enter the number for what you want to implement...E.g 3 for Parent");
      implementation();
        /*List <Student> students = new ArrayList<>();
       students = Student.createStudent();
       
        for (Parent parent : parents) {
            for (Student student : students) {
                if(student.getName().contains(parent.getName())) {
                    parent.addChld()
                }
            }
        }*/
       
       
    }
   
    public static void implementation(){
     int message = scanner.nextInt();
      if (message == 1 || message == 2 || message == 3)
      { if (message == 1){
          Teacher.createTeacher();
      }
      if (message==2){
          Student.createStudent();
      }
      if (message==3){
      Parent.createparent();}
      }
    else System.out.println("Enter the correct number");
     implementation();
      
        
    }
}
