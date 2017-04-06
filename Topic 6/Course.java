import java.util.*;
import java.lang.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charlesw
 */
public class Course implements Cloneable {
   
private String courseName;
    private ArrayList<String> students = new ArrayList<String>(3);
    private int numberOfStudents;
    
    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }
    public ArrayList<String> getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        students.remove(student);
	 numberOfStudents--;
    }
    public void clear(){
		 students.clear();
    }
    @ Override
    public Collection clone() throws CloneNotSupportedException{
        ArrayList<String> students = getStudents();
        ArrayList<String> clonedlist = new ArrayList<String>();
        clonedlist.addAll(students);
        return clonedlist;
    }
}
