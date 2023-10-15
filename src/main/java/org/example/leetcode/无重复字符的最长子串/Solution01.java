package org.example.leetcode.无重复字符的最长子串;
import org.junit.jupiter.api.Test;
public class Solution01 {

    @Test
    public int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        if(a.length == 1){
            return 1;
        }
        else{
            int max = 0;
            for(int i = 0; i < a.length; i++){
                int max1 = 0;
                int ret = 0;
                for(int j = i+1 ; j < a.length;j++){
                    for(int k = i; k < j ;k++){
                        if(a[j]==a[k]){
                            max1 = j - i ;
                            ret = 1;
                            break;
                        }
                        else if(k == j - 1){
                            max1 = j + 1 - i;
                            break;
                        }

                    }
                    if(ret == 1){
                        break;
                    }
                }
                if(max1 > max){
                    max = max1;
                }
            }
            return max;
        }
    }
}