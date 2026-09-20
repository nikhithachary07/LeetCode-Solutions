class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        long lo=1;
        long hi=piles[piles.length-1];
        int ans=(int)hi;
        while(lo<=hi)
        {
            long mid=(lo+hi)/2;
            if(valid(piles,h,mid))
            {
                ans=(int)mid;
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean valid(int[] piles,int h,long k)
    {
        long reqtime=0;
        for(int num:piles)
        {
            reqtime+=(num+k-1)/k;
        }
        return reqtime<=h;
    }
}