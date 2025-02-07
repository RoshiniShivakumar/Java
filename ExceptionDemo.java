// Source code is decompiled from a .class file using FernFlower decompiler.
public class ExceptionDemo {
   public ExceptionDemo() {
   }

   public static void main(String[] var0) {
      try {
         int var1 = 10 / 0;
      } catch (ArithmeticException var6) {
         System.out.println("ArithmeticException: Cannot divide by zero.");
      }

      try {
         String var7 = "ABC";
         int var2 = Integer.parseInt(var7);
      } catch (NumberFormatException var5) {
         System.out.println("NumberFormatException: Invalid format for conversion to number.");
      }

      int[] var8;
      try {
         var8 = new int[]{1, 2, 3};
         System.out.println(var8[5]);
      } catch (ArrayIndexOutOfBoundsException var4) {
         System.out.println("ArrayIndexOutOfBoundsException: Invalid array index accessed.");
      }

      try {
         var8 = new int[-5];
      } catch (NegativeArraySizeException var3) {
         System.out.println("NegativeArraySizeException: Array size cannot be negative.");
      }

   }
}
