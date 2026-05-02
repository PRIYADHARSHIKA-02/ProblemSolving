package LeetCode.java;

public class MajorityElement {
        public int majorityElement(int[] nums){
            int maj = nums[0]; int vote = 0;
            for(int i = 0; i < nums.length; i++){
                if(vote == 0){
                    vote++;
                    maj = nums[i];
                }else if (maj == nums[i]){
                    vote++;
                }else{
                    vote--;
                }
          }
          return maj;
    }
}
