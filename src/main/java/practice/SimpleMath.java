package practice;

class SimpleMath {
    public static void main(String[] args) {
        SimpleMath bla = new SimpleMath();
        int sqrt = bla.sqrt5(122);
        System.out.println(sqrt);
        int alb = bla.sqrt5(16);
        System.out.println(alb);
        int lab = bla.sqrt5(7);
        System.out.println(lab);
        System.out.println(9/4);
    }

    public int sqrt(int num) {
        for (int i = 1; i < num; i++) {
            if (i * i > num) {
                return --i;
            }
        }
        return 0;
    }

    public int sqrt2(int num) {
        for (int lower = 1, middle = 2, higher = num; lower < higher;) {
            middle = (lower + higher) / 2;
            if (middle * middle == num || (middle * middle < num && (middle + 1) * (middle + 1) > num)) {
                return middle;
            }
            if ((middle + 1) * (middle + 1) < num) {
                lower = --middle;

            }
            if ((middle - 1) * (middle - 1) > num) {
                higher = middle;
            }
        }
        return 0;
    }

    public int sqrt4(int num){
        if(num < 4){
            return 1;
        } 
        int square =  2*sqrt4(num / 4);
        if((square+1) * (square+1)<= num){
            square++;
        }
        return square;
    }

    public int sqrt5(int num){
        int x = num;
        int y = 1;
        while (x > y) {
            x = (x + y) / 2;
            y = num / x;
        }
        return (int)x;
    }
}
