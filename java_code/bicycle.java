class BicycleDemo {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 =  new Bicycle();

        bicycle.changeCadence(50);
        bicycle.speedUp(10);
        bicycle.changeGear(2);
        bicycle.printStates();

        bicycle2.changeCadence(50);
        bicycle2.speedUp(10);
        bicycle2.changeGear(2);
        bicycle2.changeCadence(40);
        bicycle2.speedUp(10);
        bicycle2.changeGear(3);
        bicycle2.printStates();

        System.out.println(MountainBike.mountainBikeMessage());


        int[] anArray;
        anArray = new int [10];

         // initialize first element
         anArray[0] = 100;
         // initialize second element
         anArray[1] = 200;
         // and so forth
         anArray[2] = 300;
         anArray[3] = 400;
         anArray[4] = 500;
         anArray[5] = 600;
         anArray[6] = 700;
         anArray[7] = 800;
         anArray[8] = 900;
         anArray[9] = 1000;
 
         System.out.println("Element at index 0: "
                            + anArray[0]);
         System.out.println("Element at index 1: "
                            + anArray[1]);
         System.out.println("Element at index 2: "
                            + anArray[2]);
         System.out.println("Element at index 3: "
                            + anArray[3]);
         System.out.println("Element at index 4: "
                            + anArray[4]);
         System.out.println("Element at index 5: "
                            + anArray[5]);
         System.out.println("Element at index 6: "
                            + anArray[6]);
         System.out.println("Element at index 7: "
                            + anArray[7]);
         System.out.println("Element at index 8: "
                            + anArray[8]);
         System.out.println("Element at index 9: "
                            + anArray[9]);

        int count = 1;
        do{
            System.err.println("Count is: " + count);
            count ++;
        }while(count < 11);                   
    }
}
public class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newGear){
        gear = newGear;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }
    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence: " +cadence +" speed: " +speed + " gear: " +gear);

    }
    
}


class MountainBike extends Bicycle{
    static String mountainBikeMessage(){
        return     "i'm subclass of bicycle";

    }
}




