class Solution006 {
    public static void main(String[] args) {
        int n =100;
        int sumOfSq = (n*(n+1)*(2*n+1))/6;
        int sqOfSum = (n*(n+1))/2 ;
        sqOfSum = sqOfSum*sqOfSum;
        System.out.println(sqOfSum -sumOfSq);
    }
}