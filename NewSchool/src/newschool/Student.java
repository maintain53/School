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
public class Student {

    private static String name;
    private static String classe;
    private static List<Subject> sub = new ArrayList<>();

    public Student(String name, String classe , List<Subject> sub) {
        this.name = name;
        this.classe = classe;
        this.sub = sub;

    }
    static List<Subject> subject = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Student stu = new Student(name, classe,sub);
    static List<Student> studentList = new ArrayList<>();

    public static List<Student> createStudent() {
        System.out.println("Enter number of students you want to create......");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name of student");
            name = scanner.nextLine();
            System.out.println("Enter classof student");
            classe = scanner.nextLine();
            System.out.println("Enter number of subjects");
            int subject_count = scanner.nextInt();
            for (int j = 0; j < subject_count; j++) {
                System.out.println("Enter name of Subject");
                String subject_name = scanner.nextLine();
                System.out.println("Enter score of student");
                double score = scanner.nextDouble();
                System.out.println("Enter the grade");
                String grade = scanner.nextLine();
                Subject s = new Subject(subject_name, grade, score);
                subject.add(s);

            }

            stu.setClasse(classe);
            stu.setName(name);
            stu.setSub(subject);
            studentList.add(stu);
        }
        
        System.out.printf("%s", studentList);

        return studentList;
    }

    public String getClasse() {
        return classe;
    }

    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public static void setSub(List<Subject> sub) {
        Student.sub = sub;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", class=" + classe + ",  Subject=" + sub + '}';
    }
    

}
