package practice;

public class MaxProfit {
    public static void main(String [] args){
        int [] prices = {7,6,5,4,3,2,1};
        System.out.println(profitMax(prices));
        System.out.println(profitMaxviaMinMax(prices));
        int []  prices2 = {7,1,5,3,6,4};
        System.out.println(profitMax(prices2));
        System.out.println(profitMaxviaMinMax(prices2));
        int [] prices3 = {7,6,4,3,1};
        System.out.println(profitMax(prices3));
        System.out.println(profitMaxviaMinMax(prices3));
        int [] prices4 = {101, 11, 22,33,44,55,66,77,88,99};
        System.out.println(profitMax(prices4));
        System.out.println(profitMaxviaMinMax(prices4));
        int [] prices5 = {10, 11, 22,33,44,55,66,77,88,99};
        System.out.println(profitMax(prices5));
        System.out.println(profitMaxviaMinMax(prices5));
        int[] prices6 = {31, 211, 22,33,299,55,66,44,22,11};
        System.out.println(profitMax(prices6));
        System.out.println(profitMaxviaMinMax(prices6));
    }
    public static String profitMax(int[] prices) {
        System.out.println("Initializing profitMax()");
        int maxProfit = 0;
        int min = 0;
        for(int i = 0; i< prices.length-1; i++){
            for(int j = i+1; j < prices.length; j++){
                if((prices[j] - prices[i])> maxProfit){
                    maxProfit = prices[j] - prices[i];
                    min = prices[i];
                }
            }
        }  
        return ("Buy the stock on Day " + min + " for a maximum profit of "+ maxProfit+" dollars.");
    }
    
    public static String profitMaxviaMinMax(int [] prices){
        System.out.println("Initializing profitMaxviaMinMax()");
        int profit = 0;
        int min = prices[0];
        int globalmin = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - min >= profit){
                profit = prices[i] - min;
                globalmin = min;
            } else if(prices[i] < min){
                min = prices[i];
            }
        }
        return ("Buy the stock on Day "+ globalmin + " for a maximum profit of " + profit + " dollars!");
    }

    public static int findMaxfromTop(int [] nums){
        int max = nums[nums.length-1];
        for(int i = nums.length-2; i >=0; i--){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static int findMinfromBottom(int [] nums){
        int min = findMaxfromTop(nums);
        for(int i = 0; i < nums.length; i++){
            if(min < nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}