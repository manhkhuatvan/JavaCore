package _1basicconcept.autoboxingunboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        // creating an Integer Object
        // with value 10.
        Integer i = new Integer(10);

        // unboxing the Object
        int i1 = i;

        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);

        //Autoboxing of char
        Character c = 'a';

        // Auto-unboxing of Character
        char ch = c;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of c: " + c);

        /* Here we are creating a list
          of elements of Integer type.
          adding the int primitives type values */
        List<Integer> list = new ArrayList<Integer>();
        for (int k = 0; k < 10; k++) {
            list.add(k);
        }

        /* Here we are creating a list of elements
          of Integer type. Adding the int primitives
          type values by converting them into Integer
          wrapper Object*/
        list = new ArrayList<Integer>();
        for (int j = 0; j < 10; j++) {
            list.add(Integer.valueOf(j));
        }

        /* Here we are creating a list of elements
           of Integer type and adding the int primitives
           type values to the list*/
        list = new ArrayList<Integer>();
        for (i = 0; i < 10; i++)
            list.add(i);

        // getting sum of all odd no. in the list.
        int sumOdd = sumOfOddNumber(list);
        System.out.println("Sum of odd numbers = " + sumOdd);
    }

    public static int sumOfOddNumber(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            // unboxing of i automatically
            if (i % 2 != 0) {
                sum += i;
            }
            /* unboxing of i is done automatically
               using intvalue implicitly
            if(i.intValue() % 2 != 0)
                sum += i.intValue();*/
        }
        return sum;
    }
}
