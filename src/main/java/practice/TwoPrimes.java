package practice;

import java.util.*;

public class TwoPrimes implements PrimePair { 
    public static void main(String [] args){
        PrimePair bla = new TwoPrimes(0, 25);
        PrimePair alb = new TwoPrimes(2, Integer.MAX_VALUE);
        List <PrimePair> lba = new ArrayList<PrimePair>();
        System.out.println(bla.getLesser());
        System.out.println(bla.getGreater());
        System.out.println(bla);
        lba.add(bla);
        lba.add(alb);
        System.out.println(lba);
    }

    public TwoPrimes(int lesser, int greater) {
        this.lesser = lesser;
        this.greater = greater;
    }

    int lesser = 0;
    int greater = 0;

    @Override
    public int getLesser() {
        return lesser;
    }


    @Override
    public int getGreater() {
        return greater;
    }

    @Override
    public String toString() {
        return "(" + lesser + ", " + greater + ")";
    }


    
}
