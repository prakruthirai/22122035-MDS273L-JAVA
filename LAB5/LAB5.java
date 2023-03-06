import java.util.Scanner;

public class LAB5 {
    private static final String CIPHER = "XYZABCDEFGHIJKLMNOPQRSTUVW";

    public static String encrypt(String message) {
        String encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isAlphabetic(ch)) {
                int index = Character.toUpperCase(ch) - 'A';
                encrypted += CIPHER.charAt(index);
            } else {
                encrypted += ch;
            }
        }
        return encrypted;
    }

    public static String decrypt(String message) {
        String decrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isAlphabetic(ch)) {
                int index = CIPHER.indexOf(Character.toUpperCase(ch));
                decrypted += (char) (index + 'A');
            } else {
                decrypted += ch;
            }
        }
        return decrypted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Encrypt a message");
            System.out.println("2. Decrypt a message");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the message to encrypt: ");
                    String messageToEncrypt = scanner.nextLine();
                    System.out.println("Encrypted message: " + encrypt(messageToEncrypt));
                    break;
                case 2:
                    System.out.print("Enter the message to decrypt: ");
                    String messageToDecrypt = scanner.nextLine();
                    System.out.println("Decrypted message: " + decrypt(messageToDecrypt));
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }
        }
    }
}
