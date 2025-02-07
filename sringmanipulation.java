public class stringmanipulation {
    public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "MissWorld";
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    int length1 = charArray1.length;
    int length2 = charArray2.length;
    System.out.println("Length of String 1: " + length1);
    System.out.println("Length of String 2: " + length2);
    int position = 0;
    char charAtPos1 = charArray1[position];
    char charAtPos2 = charArray2[position];
    System.out.println("Character at position " + position + " in String 1: " +
    charAtPos1);
    System.out.println("Character at position " + position + " in String 2: " +
    charAtPos2);
    String concatenatedString = str1 + str2;
    System.out.println("Concatenated String: " + concatenatedString);
    }
    }
