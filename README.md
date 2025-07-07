# 📚 Student Management System – Java Console Application

**🎓 Course:** Object Oriented Programming  
**📅 Semester:** 2nd Semester  
**🏫 Institution:** SZABIST  

---

## 📘 Project Overview

This **Java Console-Based Student Management System** allows an institute or administrator to manage student data, including:

- Adding student records
- Searching for a student by roll number
- Updating or deleting existing records
- Enrolling students in courses with credit hour and tuition calculations

The system is built with **OOP principles** in Java using `inheritance`, `arrays`, and `random ID generation`.

---

## ⚙️ Features

### 👤 Student Record Operations
- **Add**: Add student records (Name, Father's Name, Auto-generated Roll No)
- **Search**: Retrieve a student’s details using Roll No
- **Update**: Modify existing student data
- **Delete**: Remove student records

### 📚 Course Registration System
- Department-specific course offerings (BSCS, BSM, BSBE)
- Selection of **Theory** or **Lab** type courses
- Calculation of:
  - **Credit hours** (Lab: 1 CH, Theory: 3 CH)
  - **Tuition fees** (Lab: Rs. 6000, Theory: Rs. 18000)

---

## 🧠 Concepts Practiced

- **Object-Oriented Programming**:
  - Class inheritance (`student` → `Management`)
  - Encapsulation of operations
- **Control Structures**:
  - Loops and conditionals
- **Data Structures**:
  - Arrays for storing student details
- **Randomization**:
  - Random roll number generation
- **Scanner Class**:
  - For console-based input

---

## 🗂 Class Structure

### `Main.java`
- Entry point of the program
- Displays a menu to perform operations via `Management` class

### `Management.java`
- Core logic class extending `student`
- Implements all student record operations
- Includes `enroll()` method for course selection and fee calculation

### `student.java`
- Base class containing protected fields for student name, father name, and roll number

---

## 🖥️ How It Works

1. Run the `Main` class
2. Choose operations from the displayed menu:
   - `1`: Add student details
   - `2`: Search student
   - `3`: Delete student
   - `4`: Update student
   - `5`: Enroll in courses
   - `6`: Exit
3. Input is taken from the user via the console

---

## 📦 How to Run

1. Compile using any Java IDE (e.g., IntelliJ IDEA, Eclipse) or terminal:
   ```bash
   javac Main.java student.java Management.java
   java Main
