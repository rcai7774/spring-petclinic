package practice;

//use length of existing array, and the existing mean, multiply existing mean by existing length, add new element (sum) in, divide by (length+1)
public class Meanone {
   /** initialize your data structure here. */
   public Meanone() {

   }

   double mean = 0.0;
   int count = 0;
   double sum = (mean * count);

   public void addNum(int num) {
      sum = sum + num;
      count = count++;

   }

   public double findMean() {
      mean = sum / count;
      return mean;
   }
}
