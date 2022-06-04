public class Triangle {
  public static void drawTriangle(int N){
    String out = "*";
    int x = 0;
    int y = 0;
    while (x < N){
      y = 0;
      while (y < x){
        System.out.print(out);
        y++;
      }
      System.out.println();
      x++;
    }
  }
  public static void main(String[] args) {
    drawTriangle(10);
  }
} 