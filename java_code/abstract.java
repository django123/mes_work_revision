public abstract Animal {
    protected int age;
    public void eat(){
        System.out.println("Animal is eating!");
    }
    public abstract String getName();
}

public class Swan extends Animal {
  public String getName(){
      return "swan";
  }
}

