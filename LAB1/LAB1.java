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
