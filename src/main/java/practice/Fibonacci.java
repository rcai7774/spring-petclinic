package practice;

import java.util.*;

public class Fibonacci implements Fibo{
    public static void main (String [] args){
        Fibonacci fibs = new Fibonacci();
        System.out.println(fibs.fibCount());
        System.out.println(fibs.maxFib());
        int []  squares = fibs.squareFibs();
        System.out.println("SquareFibs:");
        for(int i : squares){
            System.out.println(i);
        }     
        int [] primes = fibs.primeFibs();   
        System.out.println("PrimeFibs: ");
        for(int i : primes){
            System.out.println(i);
        }

    }

    private ArrayList<Integer> fib = new ArrayList<Integer>();
    private ArrayList<Integer> squares = new ArrayList<Integer>();
    private ArrayList<Integer> primes = new ArrayList<Integer>();
    
    public Fibonacci() {
        fib.add(0);
        fib.add(1);
        for(int i = 2; ; i++){
            if(fib.get(i-2) + fib.get(i-1) < Integer.MAX_VALUE && fib.get(i-2) + fib.get(i-1) > 0){
                fib.add(fib.get(i-2) + fib.get(i-1));
            } else{break;}
        }
        
    }

    @Override
    public int fibCount() {
        return fib.size() -1;
    }
    @Override
    public int maxFib() {
        return fib.get(fib.size()-1);
    }
    @Override
    public int[] squareFibs() {
        for(int i = 1; i < fib.size(); i++){
            if(Math.floor(Math.sqrt(fib.get(i))) == Math.ceil(Math.sqrt(fib.get(i)))){
                squares.add(fib.get(i));
            }
        }
        int [] squaresArray = squares.stream().mapToInt(i->i).toArray();
        return squaresArray;
    }
    @Override
    public int[] primeFibs() {
        for(int i = 0; i < fib.size(); i++){
            int count = 0;
            for(int j = 1; j <= fib.get(i); j++){
                if(fib.get(i) % j == 0){
                    count++;
                }
            }
            if(count == 2){
                primes.add(fib.get(i));
            }
        }
        int [] primesArray = primes.stream().mapToInt(i->i).toArray();
        return primesArray;
    }
    @Override
    public int[] digitSum() {
        return null;
    }
}
