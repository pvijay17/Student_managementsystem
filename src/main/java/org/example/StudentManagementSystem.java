package org.example;
import java.util.*;
class Student{
    private int rollNo;
    private String name;
    private String course;
    public Student(int rollNo,String name , String course){
        this.rollNo=rollNo;
        this.name=name;
        this.course=course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
    public void display(){
        System.out.println("Rollno:"+rollNo+ "name:"+name+"course:"+course);
    }

}


public class StudentManagementSystem {
    public static void main(String[] args) {

Student s1=new Student(1 , "vijay" , "MCA");
s1.display();

    }
    public static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        Student s = new Student(roll, name, course);
        studentMap.put(roll, s);
        System.out.println("✅ Student added successfully.");
    }
}