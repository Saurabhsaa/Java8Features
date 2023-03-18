package com.practice.java.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            al.add(ar1[i]);
        }
        for(int i=0;i<n;i++){
            al.add(ar2[i]);
        } 
        Collections.sort(al);
        int mid = al.size()/2;
        int sum = al.get(mid)+al.get(mid-1);
        return sum;
    }
	
	public static void main(String[] args) {
		int[] ar2 = {2, 2 ,3 ,4, 9, 11, 14 ,18 ,20, 24 ,24 ,27 ,30, 34 ,39, 44, 44, 47, 50 ,50 ,52, 52, 52 ,52, 56, 56, 57};
		int[] ar1 = {3, 7, 10, 13, 13, 18, 22, 25, 29, 29, 29, 29, 29, 31, 32, 36, 41, 44, 46, 51, 51, 53, 57, 60, 65, 67, 70};
		int sum = findMidSum(ar1,ar2,27);
		System.out.println(sum);
	}
}
