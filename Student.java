// Student.java
// Defines the Student class with attributes and getter/setter methods

class Student {
    private String name;
    private long prn;
    private String dob;
    private double marks;

    // Constructor
    public Student(String name, long prn, String dob, double marks) {
        setName(name);
        setPRN(prn);
        setDOB(dob);
        setMarks(marks);
    }