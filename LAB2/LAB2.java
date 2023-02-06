import java.util.Scanner;
import java.util.Arrays;

public class LAB2 {
    public static final int MAX_LENGTH = 1024;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[MAX_LENGTH];
        int count = 0;
        int choice;
        do {
            System.out.println("1.Enter a name");
            System.out.println("2.Search for a name");
            System.out.println("3.Remove a name");
            System.out.println("0.Exit");
            System.out.println("Enter a choice");
            System.out.println("******************************");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a name: ");
                    String name = scanner.next();
                    if (count == MAX_LENGTH) {
                        System.out.println("Array is full. Unable to add more names :(");
                        System.out.println("********************************************");
                        break;
                    }
                    if (Array.asList(names).contains(name)) {
                        System.out.println("sorryyy, The name already exists");
                        System.out.println("************************************");
                        break; 
                    }
                    name[count++] = name;
                    break;
                case 2:
                    System.out.println("Enter the name you want to search");
                    name = Scanner.next();
                    int index = Arrays.asList(names).indexOf(name);
                    if (index != -1) {
                        System.out.println(name + "is found at" + index + ".");

                    } else {
                        System.out.println(name + "No such name found");
                    }
                    break;
                case 3:
                    System.out.println("Enter the name you want to remove");
                    name = scanner.next();
                    index = Arrays.asList(names).indexOf(names);
                    if (index != -1) {
                        for (int i = index; i < count - 1; i++) {
                            names[i] = names[i + 1];
                        }
                        count--;
                        System.out.println(name + " has been removed from the list");
                    } else {
                        Systen.out.println(name + " is not found in the list");
                    }
                    break;
            }

        } while (choice != 0);
    }
}
