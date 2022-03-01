//Question 2: Swap two values in list using two inputs as indexes

import java.util.*;

public class Lab6Q2 {
    
    public static void swapValues(LinkedList<Integer> sortedList, int indexOne, int indexTwo){
        //check if indexes entered are within range
        if (indexOne < 0 || indexTwo <0 || indexOne > sortedList.size()-1 || indexTwo > sortedList.size()-1){
            System.out.println("Indexes entered are out of range.");
            return;
        }

        int valueOne = sortedList.get(indexOne);
        int valueTwo = sortedList.get(indexTwo);

        sortedList.set(indexOne, valueTwo);
        sortedList.set(indexTwo, valueOne);

        System.out.println("Contents after change: " + sortedList);
    }

    public static void main(String[] args){
        LinkedList<Integer> sortedList = new LinkedList<Integer>();
        sortedList.add(1);
        sortedList.add(3);
        sortedList.add(5);
        sortedList.add(7);
        sortedList.add(9);
        sortedList.add(11);

        System.out.println("Contents: " + sortedList);
        System.out.print("Enter the two indexes of elements to swap: ");
        Scanner input = new Scanner(System.in);
        int indexOne = input.nextInt();
        int indexTwo = input.nextInt();

        swapValues(sortedList, indexOne, indexTwo);

        input.close();
    }
}
