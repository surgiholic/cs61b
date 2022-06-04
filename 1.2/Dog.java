public class Dog {
  public int pound;
  public Dog(int p){
    pound = p;
  }
  public void makeNoise(){
    if (pound < 10){
      System.out.print("yip");
    } else if (pound < 50){
      System.out.print("bark");
    } else {
      System.out.print("wooof");
    }
  }
  public static Dog maxDog(Dog d1, Dog d2){
    if (d1.pound > d2.pound){
      return d1;
    }
    return d2;
  }
}
