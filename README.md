# 🎓 Java Student Management System

## 📌 Description
This Java-based program manages student records using **classes, objects, and an ArrayList**. It provides the following operations:
- **Add students**
- **Display student records**
- **Search for a student** (by PRN, name, or position)
- **Update/Edit student details**
- **Delete a student record**

The program follows **Java best practices**, including:
- **PascalCase** for class names.
- **camelCase** for method names.
- **snake_case** for variable names.

---

## 🚀 Features
- **Stores student details** like PRN, name, date of birth, and marks.
- **Allows adding, updating, and deleting student records** dynamically.
- **Search for students** using PRN, name, or position in the list.
- **Uses ArrayList** to store student objects.

---

## 🛠️ File Structure

---

### 📄 `Student.java`
**Purpose:**  
- Represents a **single student** with attributes like **PRN, name, DoB, and marks**.

**Attributes:**
- `String name` → Stores the student's **name**.
- `long prn` → Stores the student's **PRN**.
- `String dob` → Stores the **date of birth**.
- `float marks` → Stores the **student's marks**.

**Methods:**
1. **`Student(String name, long prn, String dob, float marks)`**  
   - Constructor to initialize a student object.

2. **Getter & Setter methods**  
   - `getName()`, `setName(String name)`
   - `getPRN()`, `setPRN(long prn)`
   - `getDOB()`, `setDOB(String dob)`
   - `getMarks()`, `setMarks(float marks)`

3. **`void display()`**  
   - Displays **student details**.

---

### 📄 `StudentOperations.java`
**Purpose:**  
- Manages **student records** using an **ArrayList**.

**Methods:**
1. **`void addStudent(Student student)`**  
   - Adds a **new student** to the list.

2. **`void displayStudents()`**  
   - Prints **all student records**.

3. **`Student searchByPRN(long prn)`**  
   - Finds and returns a **student by PRN**.

4. **`Student searchByName(String name)`**  
   - Finds and returns a **student by name**.

5. **`Student searchByPosition(int position)`**  
   - Finds and returns a **student at a specific position**.

6. **`void updateStudent(long prn, String newName, String newDob, float newMarks)`**  
   - Updates a student's details **based on PRN**.

7. **`void deleteStudent(long prn)`**  
   - Removes a **student from the list**.

---

### 📄 `Main.java`
**Purpose:**  
- **Serves as the entry point** for the program.
- Displays a **menu-driven interface** for performing operations.

**Key Functionalities:**
- Takes **user input** to perform student-related operations.
- Calls respective methods from `StudentOperations.java`.

---

