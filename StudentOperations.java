// StudentOperations.java
// Handles adding, displaying, searching, updating, and deleting students

import java.util.ArrayList;

class StudentOperations {
    private ArrayList<Student> student_list; // Stores the list of students

    // Constructor initializes the student list
    public StudentOperations() {
        this.student_list = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(Student student) {
        student_list.add(student);
        System.out.println("\n Student Added Successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (student_list.isEmpty()) {
            System.out.println("\n No Students Available!");
        } else {
            System.out.println("\n Student Records:");
            for (Student student : student_list) {
                student.display();
            }
        }
    }

    // Search student by PRN
    public void searchByPRN(long prn) {
        for (Student student : student_list) {
            if (student.getPRN() == prn) {
                System.out.println("\n Student Found:");
                student.display();
                return;
            }
        }
        System.out.println("\n No student found with PRN: " + prn);
    }