package org.academiadecodigo.bootcamp;

import java.util.Iterator;

public class NewRange implements Iterable {


    private int min;
    private int max;
    private boolean change;

    public NewRange(int min, int max, boolean change){
        this.min = min;
        this.max = max;
        this.change = change;


    }

    public Iterator<Integer> iterator() {
        return new Iterator(){

            int counter = min - 1;
            int counterc = max + 1;

            @Override
            public boolean hasNext() {
                if(change == false){

                    if(counter < max){
                        return true;}

                } else {
                    if(counterc > min) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public Integer next() {
                if(change == false){
                    counter ++;
                    return counter;


                } else{
                    counterc --;
                    return counterc;
                }
                }


        };
    }

}


