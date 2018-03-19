package org.academiadecodigo.bootcamp;

import java.util.Iterator;

public class RangeTest {

    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        NewRange newrange = new NewRange(0,10, true);
        Iterator iterator = newrange.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



        //System.out.println(iterator.);

    }
}
