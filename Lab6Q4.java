import java.util.*;

public class Lab6Q4 {

    public static void addAndSort(HashMap<Integer, Integer> list, int value){
        int i;
        for (i = 0; i < list.size(); i++){
            if (list.get(i) != null){
                list.put(value, value);
                System.out.println("Contents after change: " + list);
                return;
            }
        }
    }
    public static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        // hashMap.put(0,1);
        // hashMap.put(1,3);
        // hashMap.put(2,5);
        // hashMap.put(3,7);
        // hashMap.put(4,9);
        // hashMap.put(5,11);

        hashMap.put(1,1);
        hashMap.put(3,3);
        hashMap.put(5,5);
        hashMap.put(7,7);
        hashMap.put(9,9);
        hashMap.put(11,11);

        System.out.println("Keys: " + hashMap);
        System.out.println("Size: " + hashMap.size());
        System.out.print("Enter integer: ");
        Scanner input = new Scanner(System.in);
        int integerinput = input.nextInt();

        addAndSort(hashMap, integerinput);

        input.close();
    }
}
