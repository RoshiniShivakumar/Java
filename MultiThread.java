import java.util.Random;
public class MultiThread{

    // Shared Data class to hold the generated number
    static class SharedData {
        private int number;

        public synchronized int getNumber() {
            return number;
        }

        public synchronized void setNumber(int number) {
            this.number = number;
        }
    }

    // Runnable for generating random numbers
    static class GenerateRandomNumber implements Runnable {
        private final SharedData sharedData;

        public GenerateRandomNumber(SharedData sharedData) {
            this.sharedData = sharedData;
        }

        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                int randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
                System.out.println("Generated number: " + randomNumber);
                sharedData.setNumber(randomNumber);  // Update shared data with generated number
                try {
                    Thread.sleep(1000);  // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Runnable for computing the square of an even number
    static class ComputeSquare implements Runnable {
        private final SharedData sharedData;

        public ComputeSquare(SharedData sharedData) {
            this.sharedData = sharedData;
        }

        @Override
        public void run() {
            while (true) {
                int number = sharedData.getNumber();
                if (number % 2 == 0) {
                    System.out.println("Square of " + number + " is: " + (number * number));
                }
                try {
                    Thread.sleep(500);  // Sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Runnable for computing the cube of an odd number
    static class ComputeCube implements Runnable {
        private final SharedData sharedData;

        public ComputeCube(SharedData sharedData) {
            this.sharedData = sharedData;
        }

        @Override
        public void run() {
            while (true) {
                int number = sharedData.getNumber();
                if (number % 2 != 0) {
                    System.out.println("Cube of " + number + " is: " + (number * number * number));
                }
                try {
                    Thread.sleep(500);  // Sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        // Create threads using Runnable
        Thread thread1 = new Thread(new GenerateRandomNumber(sharedData));
        Thread thread2 = new Thread(new ComputeSquare(sharedData));
        Thread thread3 = new Thread(new ComputeCube(sharedData));

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
