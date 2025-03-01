import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            // Display menu options
            System.out.println("\n Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter PRN: ");
                    long prn = scanner.nextLong();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter DOB (DD/MM/YYYY): ");
                    String dob = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    operations.addStudent(new Student(name, prn, dob, marks));
                    break;

                case 2:
                    operations.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter PRN to search: ");
                    operations.searchByPRN(scanner.nextLong());
                    break;

                case 4:
                    System.out.print("Enter Name to search: ");
                    operations.searchByName(scanner.nextLine());
                    break;

                case 5:
                    System.out.print("Enter Position to search: ");
                    operations.searchByPosition(scanner.nextInt());
                    break;
