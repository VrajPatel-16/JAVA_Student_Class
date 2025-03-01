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

    // Search student by Name
    public void searchByName(String name) {
        for (Student student : student_list) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("\n Student Found:");
                student.display();
                return;
            }
        }
        System.out.println("\n No student found with Name: " + name);
    }

    // Search student by Position
    public void searchByPosition(int position) {
        if (position >= 0 && position < student_list.size()) {
            System.out.println("\n Student at Position " + position + ":");
            student_list.get(position).display();
        } else {
            System.out.println("\n Invalid Position! Please enter a valid index.");
        }
    }

    // Update/Edit Student details
    public void updateStudent(long prn, String new_name, String new_dob, double new_marks) {
        for (Student student : student_list) {
            if (student.getPRN() == prn) {
                student.setName(new_name);
                student.setDOB(new_dob);
                student.setMarks(new_marks);
                System.out.println("\n Student Updated Successfully!");
                return;
            }
        }
        System.out.println("\n No student found with PRN: " + prn);
    }

    // Delete student
    public void deleteStudent(long prn) {
        for (Student student : student_list) {
            if (student.getPRN() == prn) {
                student_list.remove(student);
                System.out.println("\n Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("\n No student found with PRN: " + prn);
    }
}
