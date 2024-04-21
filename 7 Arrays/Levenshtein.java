public class Levenshtein {
    public static int calculateDistance(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        // dynamic programming: dp[i][j] 表示从 str1 的前 i 个字符到 str2 的前 j 个字符的编辑距离。

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String str1 = "ape";
        String str2 = "ace";
        int distance = calculateDistance(str1, str2);
        System.out.println("Levenshtein Distance between '" + str1 + "' and '" + str2 + "' is: " + distance);
    }
}
