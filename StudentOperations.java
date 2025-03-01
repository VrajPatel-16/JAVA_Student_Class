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
        System.out.println("\n✅ Student Added Successfully!");
    }