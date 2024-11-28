package com.Problem_Set_III;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Is_Distinct {
	public List<Integer> Listing_Distinct_El() {
		System.out.println("question(12)----------------------------");
    	
		int[] arr= {1,2,3,4,4,8,9,1,2,3};
		System.out.println(Arrays.toString(arr));
		List<Integer> distinctList = new ArrayList<>();
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			boolean Is_Distinct=true;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					Is_Distinct=false;
					break;
				}
			
			}
			if(Is_Distinct) {
				distinctList.add(arr[i]);
			}
		}
		System.out.println("The distinct elements of the list is: ");
		return distinctList;
	}

}
