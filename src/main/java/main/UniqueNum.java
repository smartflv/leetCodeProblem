package main;
import java.util.*;

public class UniqueNum {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(2);
        myList.add(1);
        myList.add(1);
        myList.add(3);

        countNum(myList);
    }

    public static Boolean countNum (List<Integer> myList) {
        Map<Integer, Integer> numCount = new TreeMap<>();
        TreeSet<Integer> uniqSet = new TreeSet<>();

        for(Integer i : myList){
            Integer firstCount = numCount.get(i);

            if(firstCount != null){
                int secondCount = firstCount +1;
                numCount.put(i, secondCount);
            } else {
                numCount.put(i, 1);
            }
        }

        for(Integer uniqNum : numCount.values()) {
            uniqSet.add(uniqNum);
        }

        if(uniqSet.size() == numCount.size()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        return uniqSet.size() == numCount.size();
    }

}
