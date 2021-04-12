import java.util.Arrays;

public class K_String {
    /*
    * 具有恰好包含K种字符的子串数
    * 给定一个字符串s，只包含小写英文字母， 在给定正整数k，求恰好包含k种字符的子串数
    * 例如 s =' abcba' k=3 答案是5
    * [0,2],[0,3], [0,4], [1,4], [2,4]
    * */
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i =1; i<dp.length; i++){
            for(int coin: coins){
                if(coin<=i){
                    dp[i] = Math.min(dp[i-coin] +1, dp[i]) ;
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,5};
        System.out.println(K_String.coinChange(a,11));
    }
}
