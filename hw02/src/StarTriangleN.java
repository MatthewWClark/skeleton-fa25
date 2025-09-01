public class StarTriangleN {
   /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   public static void starTriangle(int N) {
       String star = "*";
       for (int i = 1; i<=N;i++){
          System.out.println(star.repeat(i));
      }
   }
   
   public static void main(String[] args) {
      starTriangle(7);
   }
}