package practice;

import java.util.ArrayList;
import java.util.List;

public class GoldBachImplementation implements GoldbachService{
    public static void main(String [] args){
        GoldbachService goldb = new GoldBachImplementation();
        System.out.println(goldb.findPrimePairs(20008));
    }

    @Override
    public List<PrimePair> findPrimePairs(int even) throws IllegalArgumentException {
        List<PrimePair> primes = new ArrayList<PrimePair>();
        if(even % 2 != 0){
            throw new IllegalArgumentException("Not an even number!");
        }
        for(int i = 2; i <= even/2; i++){
            boolean first = isPrime(i);
            boolean last = isPrime(even -i);
            if(first){
                if(last){
                    PrimePair bla = new TwoPrimes(i, (even -i));
                   primes.add(bla);
                }
            }
        }
        return primes;
    }

    public boolean isPrime (int n){
        int count = factorCount(n);
        if(count == 2){
            return true;
        }
        return false;
    }

    public int factorCount (int k){
        int count = 0;
        for(int i = 1; i <= k; i++){
            if(k % i == 0){
                count++;
            }
        }
        return count;
    }
    
}
