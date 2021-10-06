public class DogRunner
{
  public static void main(String[] args)
  {
    Dog d = new Dog("Duke");
    
    String name = d.getName();
    
    System.out.println("Hello, my name is " + name + "!");
    
    System.out.println("He is a " + d.isGoodDog() + " good dog.");
  }
}