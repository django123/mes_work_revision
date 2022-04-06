package codingame;


//sumRange
// Solution.sumRange should return the sum of integers having value between 10 ti 100 inclusive and belonging to the array ints

public class RangeTest1 {


    public static void main(String[] args){

        System.out.println(sumRange(12, 18)); // prints 105
        System.out.println(sumRange(18, 12)); // prints 0
        System.out.println(sumRange(18, 18)); // prints 18
    }

    public static int sumRange(int low, int high)
    {
        int sum = 0;

        for (int val = low; val <= high; val++){
            sum += val;
        }

        return sum;
    }
    
}
