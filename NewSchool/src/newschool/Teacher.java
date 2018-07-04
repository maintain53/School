/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschool;

import java.util.*;


/**
 *
 * @author DELL
 */
public class Teacher {

    private static String name;
    private static String qualification;
    private static String Email;
    private static String classe;

    public Teacher(String name, String qualification, String Email, String classe) {
        this.name= name;
        this.qualification=qualification;
        this.Email =Email;
        this.classe = classe;
        
    }



    
    static Scanner scanner = new Scanner(System.in);
    static List<Teacher> teacher = new ArrayList<>();

    public static void createTeacher() {
        System.out.println("Enter number of teachers you want to create......");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name of teacher");
            name = scanner.nextLine();
            System.out.println("Enter email of teacher");
            Email = scanner.nextLine();
            System.out.println("Enter qualification of teacher");
            qualification = scanner.nextLine();
            System.out.println("Enter class of teacher");
            classe = scanner.nextLine();
              Teacher te = new Teacher (name,qualification,Email,classe);
            teacher.add(te);
            
        }
        System.out.printf("%s", teacher);
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", Qualification =" + qualification + ", Email =" + Email+ ", Class=" + classe + '}';
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public String getEmail() {
        return Email;
    }

    public String getClasse() {
        return classe;
    }


    
   
    

}
