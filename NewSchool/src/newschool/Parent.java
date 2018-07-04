/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschool;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Parent {

    private static String name;
     private static String child;
   static List <Parent> parents = new ArrayList<>();
   static Scanner scanner = new Scanner(System.in);
   
   

    public Parent(String name, String child) {
        this.name = name;
        this.child = child;
    }

    public static void createparent() {
        System.out.println("Enter number of parents you want to create......");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name of student");
            name = scanner.nextLine();}
       List <Student> students = new ArrayList<>();
       students = Student.createStudent();
        for (Parent parent : parents) {
            for (Student student : students) {
                if(student.getName().contains(Parent.getName())) {
                    child = student.getName();
           Parent p = new Parent(name,child);
                 parents.add(p);
                }
            }
        }
        }
    
    
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getChild() {
        return child;
    }

    public static void setChild(String child) {
        Parent.child = child;
    }

}
