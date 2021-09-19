package practice;

public class PythagTripleImplements implements PythagTriple{
    public static void main(String [] args){
        PythagTriple python = new PythagTripleImplements();
        System.out.println(python.getA());
        System.out.println(python.getB());
        System.out.println(python.getC());
    }

    public PythagTripleImplements() {
    }
    int pythonA = 0;
    int pythonB = 0;
    int pythonC = 0;

    @Override
    public int getA() {
        return pythonA;
    }

    @Override
    public int getB() {
        return pythonB;
    }

    @Override
    public int getC() {
        return pythonC;
    }

    public int[] getAllPythags(int n){
        int befC = n;
        for(int i = 2; i <= n; i++){
            if(Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n))){
               // for(int )
            }
        }
       // return {0, 1};
       return 0;
    }

    public int [] greatestCD(int n){
        int [] 
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; i < n; j++){
                for(int k = 2; i < n; k++){
                    if((i*i) + (j*j) == (k*k)){
                        a = i;
                        b = j;
                        c = k;
                    }
                }
            }
        }
    }
    
}
