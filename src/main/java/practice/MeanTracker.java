package practice;

class MeanTracker {

    public static void main(String[] args) {
        MeanTracker obj = new MeanTracker();
        obj.addNum(5);
        double meany = obj.findMean();
        obj.addNum(3);
        meany = obj.findMean();
        obj.addNum(7);
        meany = obj.findMean();
        obj.addNum(7);
        meany = obj.findMean();
        obj.addNum(7);
        obj.addNum(7);
        obj.addNum(7);
        obj.addNum(7);
        obj.addNum(98);
        meany = obj.findMean();
        for(int i = 0; i < 1000000000; i++){
            obj.addNum(0 + (int)(Math.random() * ((10000 - 0) + 1)));
        }
        meany = obj.findMean();
        System.out.println("The mean of these numbers is " + meany + ".");
        System.out.println("The hashcode of the object is " + obj.hashCode() + ".");
    }

    /** initialize your data structure here. */
    private int sum = 0, length = 0;

    /*public MeanTracker() {
        System.out.println("We are entering the constructor.");
        System.out.println("We are exiting the constructor.");

    }*/

    public void addNum(int num) {
        length++;
        // sum = (length == 1) ? num+0: sum+num;
        sum += num;
    }

    public double findMean() {
        return (double) sum / length;
    }
}
