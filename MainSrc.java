import java.util.Scanner;
public class Mainsrc {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuffer s1 = new StringBuffer(s.nextLine());
        int l = s1.length();
        System.out.println("Length of the string: " + l);
        StringBuffer r = s1.reverse();
        System.out.println("Reversed string: " + r);
             System.out.print("Enter the starting index to delete: ");
        int start = s.nextInt();
        System.out.print("Enter the ending index to delete: ");
        int end = s.nextInt();
             if (start < 0 || end > l || start >= end) {
            System.out.println("Invalid indices for deletion.");
        } else {
            s1.delete(start, end);
            System.out.println("String after deletion: " + s1);
        }
        s.close();
    }
}
