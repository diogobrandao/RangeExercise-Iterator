package org.academiadecodigo.bootcamp;

import java.util.Iterator;


    public class Range implements Iterable<Integer>{

        private int min;
        private int max;
        private int counterC;

        public Range(int min, int max, int counter){
            this.min = min;
            this.max = max;
            this.counterC = counterC;
        }





        @Override
        public Iterator<Integer> iterator() {
            return new MyIterator();
            }


        private class MyIterator implements Iterator {
            int counter = min -1;  //batotazinha pra o counter final incluir o minimo


            @Override
            public boolean hasNext() {
                if(counter < max){  //true - porq ainda tem numeros com numero a seguir
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                counter++;
                return counter;
            }
        };





    }


