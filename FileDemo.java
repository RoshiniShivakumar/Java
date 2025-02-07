import java.io.File;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("File exists: " + file.exists());
            System.out.println("File is readable: " + file.canRead());
            System.out.println("File is writable: " + file.canWrite());
            if (file.isDirectory()) {
                System.out.println("The file is a directory.");
            } else if (file.isFile()) {
                System.out.println("The file is a regular file.");
            }
            System.out.println("File length: " + file.length() + " bytes");
        } else {
            System.out.println("The file does not exist.");
        }
        scanner.close();
    }
}
