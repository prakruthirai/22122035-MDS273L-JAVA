package LAB6;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab6 {
    private int regNo;
    private String name;
    private String email;
    private String phone;
    private String studentClass;
    private String department;

    public lab6(int regNo, String name, String email, String phone, String studentClass, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.studentClass = studentClass;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Reg. No.: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + studentClass);
        System.out.println("Department: " + department);
    }

    @Override
    public String toString() {
        return regNo + "," + name + "," + email + "," + phone + "," + studentClass + "," + department;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }
}

class Main {
    private static final int MAX_STUDENTS = 100;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            System.out.println("\nMenu Options:");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Update student details");
            System.out.println("4. Display all students");
            System.out.println("5. Save student details to file");
            System.out.println("6. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    saveStudentDetailsToFile();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        if (numStudents == MAX_STUDENTS) {
            System.out.println("Maximum number of students reached.");
            return;
        }

        System.out.println("\nEnter the details of the student:");
        System.out.print("Reg. No.: ");
        int regNo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Class: ");
        String studentClass = scanner.nextLine();

        System.out.print("Department: ");
        String department = scanner.nextLine();

        Student student = new Student(regNo, name, email, phone, studentClass, department);
        students[numStudents] = student;
        numStudents++;
    }

    private static void searchStudent() {
        System.out.println("\nSearch for a student:");
        System.out.println("1. Search by name");
        System.out.println("2. Search by register number");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the name of the student to search: ");
                String name = scanner.nextLine();

                boolean foundByName = false;
                for (int i = 0; i < numStudents; i++) {
                    Student student = students[i];
                    if (student.getName().equals(name)) {
                        student.printDetails();
                        foundByName = true;
                    }
                }

                if (!foundByName) {
                    System.out.println("Student with name " + name + " not found.");
                }
                break;
            case 2:
                System.out.print("Enter the register number of the student to search: ");
                int regNo = scanner.nextInt();

                boolean foundByRegNo = false;
                for (int i = 0; i < numStudents; i++) {
                    Student student = students[i];
                    if (student.getRegNo() == regNo) {
                        student.printDetails();
                        foundByRegNo = true;
                        break;
                    }
                }

                if (!foundByRegNo) {
                    System.out.println("Student with register number " + regNo + " not found.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void updateStudent() {
        System.out.println("\nUpdate student details:");
        System.out.println("1. Update by name");
        System.out.println("2. Update by register number");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the name of the student to update: ");
                String name = scanner.nextLine();

                boolean foundByName = false;
                for (int i = 0; i < numStudents; i++) {
                    Student student = students[i];
                    if (student.getName().equals(name)) {
                        System.out.print("Enter the new details of the student:");
                        System.out.print("Reg. No.: ");
                        int regNo = scanner.nextInt();
                        scanner.nextLine(); // consume the newline character

                        System.out.print("Name: ");
                        String newName = scanner.nextLine();

                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        System.out.print("Phone: ");
                        String phone = scanner.nextLine();

                        System.out.print("Class: ");
                        String studentClass = scanner.nextLine();

                        System.out.print("Department: ");
                        String department = scanner.nextLine();

                        student = new Student(regNo, newName, email, phone, studentClass, department);
                        students[i] = student;
                        foundByName = true;
                        break;
                    }
                }

                if (!foundByName) {
                    System.out.println("Student with name " + name + " not found.");
                } else {
                    System.out.println("Student details updated.");
                }
                break;
            case 2:
                System.out.print("Enter the register number of the student to update: ");
                int regNo = scanner.nextInt();

                boolean foundByRegNo = false;
                for (int i = 0; i < numStudents; i++) {
                    Student student = students[i];
                    if (student.getRegNo() == regNo) {
                        System.out.print("Enter the new details of the student:");
                        System.out.print("Reg. No.: ");
                        int newRegNo = scanner.nextInt();
                        scanner.nextLine(); // consume the newline character

                        System.out.print("Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        System.out.print("Phone: ");
                        String phone = scanner.nextLine();

                        System.out.print("Class: ");
                        String studentClass = scanner.nextLine();

                        System.out.print("Department: ");
                        String department = scanner.nextLine();

                        student = new Student(newRegNo, name, email, phone, studentClass, department);
                        students[i] = student;
                        foundByRegNo = true;
                        break;
                    }
                }

                if (!foundByRegNo) {
                    System.out.println("Student with register number " + regNo + " not found.");
                } else {
                    System.out.println("Student details updated.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void displayAllStudents() {
        if (numStudents == 0) {
            System.out.println("No students added yet.");
        } else {
            System.out.println("\nDetails of all students:");

            for (int i = 0; i < numStudents; i++) {
                Student student = students[i];
                student.printDetails();
            }
        }
    }

    private static void saveStudentDetailsToFile(Student student) {
        try {
            String fileName = student.getName() + ".txt";
            PrintWriter writer = new PrintWriter(fileName);
            writer.println(student.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error saving student details to file.");
        }
    }

    private static void saveAllStudentsDetailsToFile() {
        if (numStudents == 0) {
            System.out.println("No students added yet.");
        } else {
            for (int i = 0; i < numStudents; i++) {
                Student student = students[i];
                saveStudentDetailsToFile(student);
            }
            System.out.println("Student details saved to files.");
        }
    }
}


public static void main(String[] args) {
    int choice;
    do {
        System.out.println("\nMenu:");
        System.out.println("1. Add a student");
        System.out.println("2. Search for a student");
        System.out.println("3. Update the details of a student");
        System.out.println("4. Display all students");
        System.out.println("5. Save the details of each student in a file");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                searchStudent();
                break;
            case 3:
                updateStudent();
                break;
            case 4:
                displayAllStudents();
                break;
            case 5:
                saveAllStudentsDetailsToFile();
                break;
            case 6:
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 6);
}
