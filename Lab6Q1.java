//Question 1: Insert integer while maintaining list order

import java.util.*;

public class Lab6Q1 {

    public static void addAndSort(LinkedList<Integer> sortedList, int value){
        int i;
        for (i = 0; i < sortedList.size(); i++){
            if (value > sortedList.getLast()){
                sortedList.add(sortedList.size(), value);
                break;
            }
            if (value <= sortedList.get(i)){
                sortedList.add(i, value);
                break;
            }
        }

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
        System.out.print("Enter integer: ");
        Scanner input = new Scanner(System.in);
        int integerinput = input.nextInt();

        addAndSort(sortedList, integerinput);

        input.close();
    }
}
