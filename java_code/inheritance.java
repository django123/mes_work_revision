package java_code;

public class Inheritance{
    public static void main(String [] args){
        Animal animal = new Animal();
        Lion lion = new Lion();
        System.out.println(lion.getAge());
    }
}

public class Animal {
    private int age;
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}

public class Lion extends Animal {
    public Lion() {
    }

    private void roar(){
        System.out.println("The " +getAge() + " year old lion says: Roar!");
    }

}
