import java.util.*;

public class Lab6Q3 {

    public static int findValue(LinkedList<Integer> list, int checkInteger){
        int i;
        for (i = 0; i < list.size(); i++){
            if (checkInteger == list.get(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int i;
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (i = 0; i < 500; i++){
            int randomInteger = (int) (Math.random() * (9999 - 1000)) + 1000;
            list.add(randomInteger);
        }

        System.out.println("Size of list: " + list.size());
        System.out.println("Contents: " + list);

        int checkInteger = (int) (Math.random() * (9999 - 1000)) + 1000;

        System.out.println("This is the random integer to find: " + checkInteger);
        System.out.println("Result: " + findValue(list, checkInteger));
    }
}
