class Solution001 {
    public static void main(String[] args){
        int n = 1000;
        int ans = sum(n-1, 3)+sum(n-1, 5)-sum(n-1, 15);
        System.out.println(ans);
    }
    
    public int sum(int n ,int d) {
		int p = n/d;
		int ans = d*((p*(p+1))/2);
        return ans;
	}
}