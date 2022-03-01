import java.util.*;

public class Lab6Q5 {
    public static void swapValues(HashMap<Integer, Integer> hashMap, int indexOne, int indexTwo){
        //check if indexes entered are within range
        if (indexOne < 0 || indexTwo <0 || indexOne > hashMap.size()-1 || indexTwo > hashMap.size()-1){
            System.out.println("Indexes entered are out of range.");
            return;
        }

        int valueOne = hashMap.get(indexOne);
        int valueTwo = hashMap.get(indexTwo);

        hashMap.put(indexOne, valueTwo);
        hashMap.put(indexTwo, valueOne);

        System.out.println("Keys after change: " + hashMap);
    }

    public static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(0,1);
        hashMap.put(1,3);
        hashMap.put(2,5);
        hashMap.put(3,7);
        hashMap.put(4,9);
        hashMap.put(5,11);

        System.out.println("Keys: " + hashMap);
        System.out.println("Size: " + hashMap.size());
        System.out.print("Enter the two indexes of elements to swap: ");
        Scanner input = new Scanner(System.in);
        int indexOne = input.nextInt();
        int indexTwo = input.nextInt();

        swapValues(hashMap, indexOne, indexTwo);

        input.close();
    }
}
