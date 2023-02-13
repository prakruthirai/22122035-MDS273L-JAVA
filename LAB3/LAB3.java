import java.util.Scanner;

public class LAB3 {
  static final int MAX_STUDENTS = 1024;
  static String[] studentNames = new String[MAX_STUDENTS];
  static String[][] studentDetails = new String[MAX_STUDENTS][5];
  static int studentCount = 0;

  static void collectDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the student: ");
    String name = sc.nextLine();

    int index = searchStudent(name);
    if (index != -1) {
      System.out.println("Details for the student with name " + name + " already exists in the system. Please try again with a different name.");
      return;
    }

    studentNames[studentCount] = name;
    System.out.println("Enter the register number: ");
    studentDetails[studentCount][1] = sc.nextLine();
    System.out.println("Enter the email: ");
    studentDetails[studentCount][2] = sc.nextLine();
    System.out.println("Enter the class: ");
    studentDetails[studentCount][3] = sc.nextLine();
    System.out.println("Enter the department: ");
    studentDetails[studentCount][4] = sc.nextLine();
    studentCount++;

    System.out.println("Details collected successfully.");
  }

  static void displayDetails() {
    System.out.println("Enter the name of the student: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    int index = searchStudent(name);
    if (index == -1) {
      System.out.println("No details found for the student with name " + name);
      return;
    }

    System.out.println("Name: " + studentNames[index]);
    System.out.println("Register Number: " + studentDetails[index][1]);
    System.out.println("Email: " + studentDetails[index][2]);
    System.out.println("Class: " + studentDetails[index][3]);
    System.out.println("Department: " + studentDetails[index][4]);
  }

  static int searchStudent(String name) {
    for (int i = 0; i < studentCount; i++) {
      if (studentNames[i].equals(name)) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Choose an operation to perform:");
      System.out.println("1. Collect student details");
      System.out.println("2. Search student details");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");

      int choice = sc.nextInt();
      if (choice == 1) {
        collectDetails();
      } else if (choice == 2) {
        displayDetails();
      } else if (choice == 3) {
        System.out.println("Exiting the program...");
        break;
}
}
}
}