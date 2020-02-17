package com.techt.interview.ds;

//Ref: https://gist.github.com/mymxyx/25dcfc5c9098c280afa26da77c6b3f44
//Didn't submitted
public class CoinArrangement {

	public int arrangeCoins(int n) {
        if(n<0) return -1;
        if(n==0) return 0;
        int rows = 0;
        long sum = 0;
        while(sum<=n){
            sum += rows+1;
            rows++;
        }
        return rows-1;
    }
}
