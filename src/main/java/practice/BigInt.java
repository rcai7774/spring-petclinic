package practice;

public class BigInt {
    public static String addStrings(String num1, String num2){
        
        int value1 = 0;
        for(int i = num1.length()-1; i >= 0; i--){
            for(int j = 0; j <=9; j++){
                String bla = Integer.toString(j);
                char blat = bla.charAt(0);
                int power = (int) Math.round(Math.pow(10, ((num1.length()-1)-i)));
                if(blat == num1.charAt(i)){
                    value1 = value1 + (j *power);
                }
            }
        }
        int value2 = 0;
        for(int k = num2.length()-1; k >= 0; k--){
            for(int l = 0; l <= 9; l++){
                String blas = Integer.toString(l);
                char blau = blas.charAt(0);
                int powers = (int) Math.round(Math.pow(10, ((num2.length()-1)-k)));
                if(blau == num2.charAt(k)){
                    value2 = value2 + (l * powers);
                    break;
                }
            }
        }
        System.out.println(value2);
        return String.valueOf(value1+value2);
    }

    public static void main(String [] args){
        String argh = addStrings("106", "20000000000");

        System.out.println(argh);

    }
    
    
}
