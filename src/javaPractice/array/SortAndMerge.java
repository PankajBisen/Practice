package javaPractice.array;

public class SortAndMerge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i=0; i < nums1.length; i++){
            if(nums1[i] == 0){
                for(; j < nums2.length; j++){
                    nums1[i] = nums2[j];
                    j++;
                    break;
                }
            }
        }

        for(int i = 0; i < nums1.length - 1; i++){
            for (int k = 0; k < nums1.length - i - 1; k++){
                if(nums1[k] > nums1[k + 1]){
                    int tmp = nums1[k];
                    nums1[k] = nums1[k + 1];
                    nums1[k + 1] = tmp;
                }
            }
        }

        for(int i=0; i < nums1.length; i++){
            System.out.println(nums1[i]);
        }
    }

    public static void main(String args[]){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1 , 3,  nums2, 3);
    }
}
