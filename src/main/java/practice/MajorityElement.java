package practice;

public class MajorityElement {
    public static int findMajority(int[] nums) {
        int m = 1;
        int comp = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(m==0){
                comp = nums[i++];
                m=1;
            }
            if(comp == nums[i]){
                m++;
            } else {
                m--;
            }
        }
        return comp;
    }

    public static void main(String [] args){
        int[] nums = {10,1,2,10,3,4,5,6,7,8,9,10,2,3,4,5,6,7,8,9,10,3,4,5,6,7,8,9,10,4,5,6,7,8,9,10,5,6,7,8,9,10,6,7,8,9,10,7,8,9,10,8,9,10,9};
        int majority = findMajority(nums);
        System.out.println(majority);
    }
}