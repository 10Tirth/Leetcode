class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while(i < j){
            int w = j-i;
            int h = Math.min(height[i], height[j]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[i] < height[j]) i++;
            else if(height[i] > height[j]) j--;
            else {
                i++;
                j--;
            }
        }
        return max;
    }
}