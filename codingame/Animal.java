package codingame;

abstract class Animal {
    abstract String getName();
}

class Dog extends Animal {
    private final String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }
}

class Cat extends Animal {
    private final String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }
}



class Application{
    static String getAnimalName(Animal a){
        String name=null;
        /*if(a instanceof Dog){
            name=((Dog)a).getName();
        }
        else if(a instanceof Cat){
            name=((Cat)a).getName();
        }*/
        name=a.getName();
        return name;
    }
}
