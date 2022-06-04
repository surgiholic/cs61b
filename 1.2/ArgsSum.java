
public class ArgsSum {
  public static void main(String[] args){
    int i = 0;
    int res = 0;
    while (i < args.length){
      res += Integer.parseInt(args[i]);
      i++;
    }
    System.out.print(res);
  }
}
