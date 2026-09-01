class Solution {
    public boolean checkDivisibility(int n) {
        int digsum=0;
        int digpro=1;
        int num=n;
        while(n>0)
        {
            int dig=n%10;
            digsum=digsum+dig;
            digpro=digpro*dig;
            n=n/10;
        }
        int sum=digsum+digpro;
        return num%sum==0;
    }
}