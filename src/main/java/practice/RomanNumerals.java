package practice;

public class RomanNumerals {
    public static void main(String [] args){
        String r_n = "CMI";
        String r_n1 = "MDCCXXIV";
        String r_n2 = "XXXIII";
        String r_n3 = "CCCLXXV";
        String r_n4 = "MMXXI";
        System.out.println(romanNumeralAsNumber(r_n));
        System.out.println(romanNumeralAsNumber(r_n1));
        System.out.println(romanNumeralAsNumber(r_n2));
        System.out.println(romanNumeralAsNumber(r_n3));
        System.out.println(romanNumeralAsNumber(r_n4));

    }
    public static int romanNumeralAsNumber(String numeral){
        System.out.println("Calculating...");
        int value = 0;
        for(int i = numeral.length()-1; i >= 0; i--){
            if(numeral.charAt(i) == 'I' && value < 5){
                value += 1;
            } else if(numeral.charAt(i) == 'I' && value >= 5){
                value -= 1;
            } if(numeral.charAt(i) == 'V'){
                value += 5;
            } if(numeral.charAt(i) == 'X' && value < 50){
                value += 10;
            } else if(numeral.charAt(i) == 'X' && value >= 50){
                value -= 10;
            } if(numeral.charAt(i) == 'L'){
                value += 50;
            } if(numeral.charAt(i) == 'C' && value < 500){
                value += 100;
            } else if(numeral.charAt(i) == 'C' && value >= 500){
                value -= 100;
            } if(numeral.charAt(i) == 'D'){
                value += 500;
            } if(numeral.charAt(i) == 'M'){
                value += 1000;
            }
        }
        return value;
    }
}
