/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschool;

/**
 *
 * @author DELL
 */
public class Subject {
    String Subject_name;
    String grade;
    double score;

    public Subject(String Subject_name, String grade, double score) {
        this.Subject_name = Subject_name;
        this.grade = grade;
        this.score = score;
    }

    public String getSubject_name() {
        return Subject_name;
    }

    public String getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }
    
    
}
