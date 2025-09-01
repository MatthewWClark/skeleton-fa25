public class PrintIndexed {
   /**
     * Prints each character of a given string followed by the reverse of its index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
   public static void printIndexed(String s) {
      // TODO: Fill in this function
       for (int i = 0; i< s.length(); i++){
           char letter = s.charAt(i);
           System.out.print(letter);
           System.out.print(s.length()-1-i);
       }
       System.out.println(" ");
   }

   public static void main(String[] args) {
      printIndexed("hello");
      printIndexed("cat"); // should print c2a1t0
   }
}