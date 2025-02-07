import java.util.Random;
public class randomnumber{
public static void main(String[] args) {
int lowerLimit = 1;
int upperLimit = 100;
Random random = new Random();
int randomNumber1 = random.nextInt(upperLimit- lowerLimit + 1) +
lowerLimit;
int randomNumber2 = random.nextInt(upperLimit- lowerLimit + 1) +
lowerLimit;
System.out.println("Random Number 1: " + randomNumber1);
System.out.println("Random Number 2: " + randomNumber2);
if (randomNumber1 <= 30) {
System.out.println("Random Number 1 is in the lower range (1-30).");
} else if (randomNumber1 <= 70) {
System.out.println("Random Number 1 is in the middle range (31-70).");
} else {
System.out.println("Random Number 1 is in the higher range (71-100).");
}
if (randomNumber2 <= 30) {
System.out.println("Random Number 2 is in the lower range (1-30).");
} else if (randomNumber2 <= 70) {
System.out.println("Random Number 2 is in the middle range (31-70).");
} else {
System.out.println("Random Number 2 is in the higher range (71-100).");
}
}
}
