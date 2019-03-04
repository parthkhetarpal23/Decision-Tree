class Solution {
    public double myPow(double x, int n) {
        int temp = n;
        if(temp<0)
            temp=temp*-1;
        if(x==1 || x==-1&& temp %2==0)
            return 1;
        if(x==-1 && temp%2==1)
            return -1;
        
        
    if(n > -2147483648 && n <= 2147483647){
    if(n==0)
        return 1;
        if(n<0)
        {
            x=1/x;
            n*=-1;
        }
    if(n%2==0)
    {
        if(x==1 || x==-1)
            return 1;
        return myPow(x*x,n/2);
    }
        else
        {
            if(x==-1)
                return 1;
            return x*myPow(x*x,n/2);
            
        }
            
    }
        else
            return 0;
    }
    
}


       
