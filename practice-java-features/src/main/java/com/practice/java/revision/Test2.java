package com.practice.java.revision;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	static int longestSubstrDistinctChars(String S){
        // code here
        Map<Character,Integer> map = new HashMap<>();
        int low=0;
        int high=1;
        map.put(S.charAt(0),0);
        int mlen = 0;
        while(low<=high&&high<S.length()){
            if(map.getOrDefault(S.charAt(high),-1)!=-1){
                int len = high-low;
                if(mlen<len){
                    mlen=len;
                }
                int ind = map.get(S.charAt(high));
                while(low<=ind){
                	 if(map.get(S.charAt(low))!=null)
                         map.remove(S.charAt(low));
                     low++;
                }
//                System.out.println(low);
//                low = high;
                map.put(S.charAt(high),high);
                high++;
            }else{
                map.put(S.charAt(high),high);
                high++;
            }
        }
        int len = high-low-1;
        if(mlen<len){
            mlen=len;
        }
        return mlen;
    }
	
	public static void main(String[] args) {
		System.out.println(longestSubstrDistinctChars("aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv"));
	}
}
