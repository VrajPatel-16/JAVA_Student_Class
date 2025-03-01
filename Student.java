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

    // Setter and Getter for Name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Setter and Getter for PRN
    public void setPRN(long prn) {
        this.prn = prn;
    }
    public long getPRN() {
        return prn;
    }

    // Setter and Getter for Date of Birth
    public void setDOB(String dob) {
        this.dob = dob;
    }
    public String getDOB() {
        return dob;
    }

    // Setter and Getter for Marks
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public double getMarks() {
        return marks;
    }
