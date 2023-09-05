package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer [] ageArray = {2,3,4,5,6,7,8,9,-10};

        System.out.println(Arrays.toString(ageArray));

        String [] myName ={"Bryan", "tolu", "nico"};

        System.out.println(myName[2]);

        Arrays.sort(myName);
        System.out.println(Arrays.toString(myName));


        Arrays.sort(myName, Collections.reverseOrder());
        System.out.println(Arrays.toString(myName));

        Arrays.sort( ageArray , Collections.reverseOrder()); // collection reverse order only works for object, change line 8 from int to interger
        System.out.println(Arrays.toString(ageArray));
    }
}
