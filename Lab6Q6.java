import java.util.*;

public class Lab6Q6 {
    public static int findValue(HashMap<Integer, Integer> hashMap, int checkInteger){
        int i;
        for (i = 0; i < hashMap.size(); i++){
            if (checkInteger == hashMap.get(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int i;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (i = 0; i < 500; i++){
            int randomInteger = (int) (Math.random() * (9999 - 1000)) + 1000;
            hashMap.put(i, randomInteger);
        }

        System.out.println("Size of hash map: " + hashMap.size());
        System.out.println("Keys: " + hashMap);

        int checkInteger = (int) (Math.random() * (9999 - 1000)) + 1000;

        System.out.println("This is the random integer to find: " + checkInteger);
        System.out.println("Result: " + findValue(hashMap, checkInteger));
    }
}
