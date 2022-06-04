public class DogLauncher { 
  public static void main(String[] args){
    Dog d1 = new Dog(20);
    // d1.makeNoise();
    Dog d2 = new Dog(60);
    // d2.makeNoise();
    Dog max = Dog.maxDog(d1, d2);
    max.makeNoise();
  }
}
