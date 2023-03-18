package com.practice.java.functionalInterfaces;

import java.util.ArrayList;

public class Test {
	public static int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int lenMergArr = ar1.length + ar2.length;
        ArrayList<Integer> al = new ArrayList<>();
        int mid1 = n;
        int count = 0;
        if(ar1.length>ar2.length){
            count = ar1.length;
        }else{
            count = ar2.length;
        }
        int pt1 = 0;
        int pt2 = 0;
        int sum = 0;
        if(n==1){
            sum += ar1[0]+ar2[0];
            return sum;
        }
        for(int i=0;i<lenMergArr-1;i++){
            if(ar1[pt1]<ar2[pt2]){
            	al.add(ar1[pt1]);
                mid1--;
                if(mid1==0){
                	sum += ar1[pt1];
                	pt1++;
                    if(pt1<n && ar1[pt2]<ar2[pt2]) {
                    	sum += ar1[pt1];
                    }else {
                    	sum += ar2[pt2];
                    }
                    break;
                }
                pt1++;
            }else{
            	al.add(ar2[pt2]);
                mid1--;
                if(mid1==0){
                	sum += ar2[pt2];
                	pt2++;
                    if(pt2<n&&ar2[pt2]<ar1[pt1]) {
                    	sum += ar2[pt2];
                    }else {
                    	sum += ar1[pt1];
                    }
                    break;
                }
                pt2++;
            }
        }
        return sum;
    }
	
	
	public static void main(String[] args) {
//		int[] ar1 = {2, 2 ,3 ,4, 9, 11, 14 ,18 ,20, 24 ,24 ,27 ,30, 34 ,39, 44, 44, 47, 50 ,50 ,52, 52, 52 ,52, 56, 56, 57};
//		int[] ar2 = {3, 7, 10, 13, 13, 18, 22, 25, 29, 29, 29, 29, 29, 31, 32, 36, 41, 44, 46, 51, 51, 53, 57, 60, 65, 67, 70};
		int[] ar1 = {5,6,11};
		int[] ar2 = {4,7,9};
		
		int sum = findMidSum(ar1,ar2,3);
		System.out.println(sum);
	}

}
class Interval{
    int start;
    int end;
    Interval(int start,int end){
        this.start=start;
        this.end=end;
    }
}