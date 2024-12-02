package com.Problem_Set_III;

import java.util.HashMap;
import java.util.Map;

public class Symmetric_Pair {
	public void find_S_pairs() {
		System.out.println("question(18)------------------------------");

		int[] arr= {1,2,4,5,6,7,2,1,3,4,4,3};
		Map<Integer,Integer>pair=new HashMap<>();
		
		for(int i=0;i<arr.length-1;i++) {
			int first=arr[i];
			int second=arr[i+1];
			if(pair.containsKey(second)&& pair.get(second)==first) {
				System.out.println("Pair:"+first+":"+second+" pair of "+second+":"+first);
			}
			else {
				pair.put(first, second);
			}
		}
		
	}

}
