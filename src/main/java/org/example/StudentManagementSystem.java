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
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, Student> studentMap = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("/n---student management system");
            System.out.println("1.Add Student ");
            System.out.println("2.view All Students");
            System.out.println("3. searchstudent by rollNo");
            System.out.println("4.Delete student");
            System.out.println("5. exit");
            System.out.println("Enter choice");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");

            }
        }
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


    public static void viewAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("--- All Students ---");
            for (Student s : studentMap.values()) {
                s.display();
            }
        }
    }
    public static void searchStudent() {
        System.out.print("Enter Roll No to Search: ");
        int roll = scanner.nextInt();

        Student s = studentMap.get(roll);
        if (s != null) {
            s.display();
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter Roll No to Delete: ");
        int roll = scanner.nextInt();

        if (studentMap.containsKey(roll)) {
            studentMap.remove(roll);
            System.out.println("✅ Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
