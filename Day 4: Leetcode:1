

Square of sorted array:

class Solution {
    public int[] sortedSquares(int[] nums) {
int c=nums.length;
int[] arr= new int[c];
int Lp=0;
int Rp=nums.length-1;
int k=Rp;
while(Rp>=Lp)
{
int SRp = nums[Rp]*nums[Rp];
int SLp= nums[Lp]*nums[Lp];
if(SRp>SLp)
{
arr[k]=SRp;
Rp--;
k--;
}
else{

    arr[k]=SLp;
    Lp++;
k--;
}


}
return arr;

    }
}

