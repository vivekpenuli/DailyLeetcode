
Find Pivot Index:

class Solution {
    public int pivotIndex(int[] nums) {
        int Lsum=0;
        int Rsum=0;
        int size=nums.length;
        for(int j=0;j<size;j++)
        {
            Rsum=Rsum+nums[j];
        }
        for(int i=0;i<size;i++)
        {
if(Lsum==Rsum-Lsum-nums[i])
{
    return i;
}
else{
    Lsum=Lsum+nums[i];
}

        }
        return -1;
    }
}

