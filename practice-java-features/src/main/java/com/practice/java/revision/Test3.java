package com.practice.java.revision;

public class Test3 {
	
	static boolean sameFreq(String s) {
        // code here
        int[] fre = new int[256];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)]++;
        }
        int i=0;
        int same = 0;
        int count = 0;
        for(i=0;i<256;i++){
            if(fre[i]>0){
                same = fre[i];
                break;
            }
        }
        Boolean flag = true;
		for (int j = i + 1; j < 256; j++) {
			if (fre[j] > 0) {
				if (fre[j] == same)
					continue;
			} else {
				count++;
				if (count > 1 && flag) {
					same = fre[j];
					flag = false;
					j = i;
					count = 0;
				}
			}
		}
        
        if(count>1){
            return false;
        }else{
            return true;
        }
    }
	
	
	public static void main(String[] args) {
		System.out.println(sameFreq("abababc"));
	}
}
