import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        long ans = solve(30,20, 11);
        System.out.println(ans);
    }

    public static long solve(int a, int b, int m){
        int ans = 0;
        if (b % 2 == 0){
            ans = (((a ^ 2) % m) ^ (b/2)) % m;
        }else {
            ans = a * (((a ^ 2) % m) ^ ((b - 1)/2)) % m;
        } 

        return ans;
    }

}

