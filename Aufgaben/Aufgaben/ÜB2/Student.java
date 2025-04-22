package ÜB2;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {
    private int matNumber, semester;
    private ArrayList<String> courses = new ArrayList<String>();

    public Student(String firstName, String lastName, int age, int matNumber, int semester, ArrayList<String> courses) {
        super(firstName, lastName, age);
        this.matNumber = matNumber;
        this.semester = semester;
        this.courses = courses;
    }

    public void printCourseList(){
        for(String course: courses){
            System.out.println(course);
        }
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " " + matNumber+ " " + semester+ " Courselist: " + courses.toString();
    }



    public void setMatNumber(int matNumber) {
        this.matNumber = matNumber;
    }



    public void setSemester(int semester) {
        this.semester = semester;
    }





}
