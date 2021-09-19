package practice;

public class TimesThreeAddOneConjecture {
    public static void main (String [] args){
         int num = (2^68) + 1;
        System.out.println(TimesThreeAddOne(num));
    }
    public static String TimesThreeAddOne(int num){
        int max = num;
        while(num != 1){
            if(num % 2 == 1){
                num = (num*3) + 1;
                if(num > max){
                    max = num;
                }
                System.out.println(num);
            } else{
                num = num/2;
                System.out.println(num);
            }
        }
        return ("Returned to 1 and max is: " + max);
    }
}
