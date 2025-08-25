package LeetCode;

public class ContainerWithMostWater_11q {
    public static int maxArea(int[] height){
        int area=0;
        int start=0;
        int end= height.length-1;

        while(start<end){
            int temp=0;
            temp=Math.min(height[start],height[end])*(end-start);
            area=Math.max(area,temp);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }

        return area;
    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
//        int[] height={8,6,2,5,4,8};


        int ans=maxArea(height);
        System.out.println(ans);
    }
}
