package com.practice.java.revision;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
	static String secFrequent(String arr[], int N)
    {
        // your code here
        List<String> li = Arrays.asList(arr);
        int mFre = 0;
        int secMax = 0;
        String str = "";
        String sSrt = "";
        for(int i=0;i<N;i++){
            int fre = Collections.frequency(li,li.get(i));
            if(fre>mFre){
            	sSrt = str;
            	secMax=mFre;
                mFre = fre;
            }else if(fre>secMax&&fre<mFre){
                secMax = fre;
                sSrt = li.get(i);
            }
        }
        return str;
    }
 
	public static void main(String[] args) {
		System.out.println(
				secFrequent(new String[]{"aaa", "bbb", "ccc", "bbb", "aaa" ,"aaa"},6));
	}
}
