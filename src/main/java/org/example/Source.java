package org.example;

import java.io.*;
import java.util.*;

public class Source {
    static final int MOD = 1000000007;
    static long[] dp = new long[200005];

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i >= 1) dp[i] += dp[i - 1]; // S
            if (i >= 2) dp[i] += dp[i - 2]; // TA, NR, ST
            if (i >= 3) dp[i] += dp[i - 3]; // TAR, NRU, STU
            dp[i] %= MOD;
        }
        System.out.println(dp[n]);
    }
}