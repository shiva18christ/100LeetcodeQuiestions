package Arrays;

import java.util.Arrays;

public class ContainerProblem {
    /* you are given an integer array of height of length n
    there are n vertical lines drawn such that the two end points
    of the ith line are(i,0) and (i,height[i])
    find the  line that together with the x-ais will form a container
    such that the container contains the most water.
    Return the maximum amount of water a container can store
     */
    public int[] calculateArea(int[] arr){
        int left=0;
        int right=arr.length-1;
        int maxArea=0;
        int maxLeft=0;
        int maxRight=0;
        while(left<right){
            int length=Math.min(arr[left],arr[right]);
            int width=Math.abs(right-left);
            int area=length*width;
            if(area>maxArea){
                maxArea=area;
                maxLeft=left;
                maxRight=right;
            }
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{maxArea,maxLeft,maxRight};
    }

    public static void main(String[] args) {
        ContainerProblem containerProblem = new ContainerProblem();
        int[] arr = {2, 3, 8, 9, 5};
        int[] result = containerProblem.calculateArea(arr);
        System.out.println(Arrays.toString(result));

    }
}
