// Source code is decompiled from a .class file using FernFlower decompiler.
public class stringop {
   public stringop() {
   }

   public static void main(String[] var0) {
      String var1 = "hellos";
      String var2 = "world";
      String var3 = var1.concat(var2);
      System.out.println("concatenated string:" + var3);
      String var4 = "world";
      boolean var5 = var3.contains(var4);
      if (var5) {
         System.out.println("\"" + var4 + "\"found in a concatenated string");
      } else {
         System.out.println("\"" + var4 + "\"not found in a concatenated string");
      }

      String var6 = var1.substring(0, 4);
      System.out.println("extracted sub string:" + var6);
   }
}
