# 22122035-MDS273L-JAVA
QUESTION:</br>
Write a Java Program that will collect an employee's basic details that fall into different data types and displays them.</br>
After the details have been displayed, with the help of conditional statements, check if the gender of the employee is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.</br>
Assume that you can divide the states among India into different regions (North, South, Central, East, and West). If the employee is from the southern part of India, with the help of a switch statement, it should display "The Employee is from the southern states of India; Preferable work location is in <state>", along with the basic details.</br>
Identify if the employee belongs to the top MNC Companies (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, print a message "The employee is working in Top MNC Companies".</br>
</br>
THE CODE: </br>
</br>
import java.util.Scanner;

public class LAB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee name:  ");
        String name = sc.nextLine();

        System.out.print("Enter the employee age:  ");
        int age = sc.nextInt();

        System.out.print("Enter the employee gender (m/f): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter the employee state: ");
        sc.nextLine();
        String state = sc.nextLine();

        System.out.print("Enter the employee company: ");
        String company = sc.nextLine();

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gender == 'm' ? "MALE" : "FEMALE"));
        System.out.println("State: " + state);
        System.out.println("Company: " + company);

        if (state.equalsIgnoreCase("Andhra Pradesh") || state.equalsIgnoreCase("Karnataka") ||
                state.equalsIgnoreCase("Kerala") || state.equalsIgnoreCase("Tamil Nadu")) {
            System.out.println("The Employee is from the southern states of India");
            System.out.print("Preferred work location is in " + state + ".");
        }

        if (state.equalsIgnoreCase("Nagaland") || state.equalsIgnoreCase("Manipur") ||
                state.equalsIgnoreCase("Meghalaya") || state.equalsIgnoreCase("Tripura")) {
            System.out.println("The Employee is from the easthern states of India");
            System.out.print("Preferred work location is in " + state + ".");
        }

        if (state.equalsIgnoreCase("Goa") || state.equalsIgnoreCase("Gujarat") ||
                state.equalsIgnoreCase("Maharashtra") || state.equalsIgnoreCase("Daman and Diu")) {
            System.out.println("The Employee is from the westhern states of India");
            System.out.print("Preferred work location is in " + state + ".");
        }

        if (state.equalsIgnoreCase(" Haryana") || state.equalsIgnoreCase("Punjab") ||
                state.equalsIgnoreCase("Uttarakhand") || state.equalsIgnoreCase("Uttar Pradesh")) {
            System.out.println("The Employee is from the northern states of India");
            System.out.print("Preferred work location is in " + state + ".");
        }

        if (company.equalsIgnoreCase("Facebook") || company.equalsIgnoreCase("Google") ||
                company.equalsIgnoreCase("Microsoft") || company.equalsIgnoreCase("Samsung") ||
                company.equalsIgnoreCase("IBM") || company.equalsIgnoreCase("Apple")) {
            System.out.println("The employee is working in Top MNC Companies.");
        }
    }
}

