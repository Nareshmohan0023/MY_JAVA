package com.Problem_Set_III;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Non_repeating {
	public List<Integer> Non_repeating_El(){
		System.out.println("question(14)----------------------------");


			int[] arr= {1,2,1,3,2,5,6,5};
			System.out.println(Arrays.toString(arr));
			int n=arr.length;
			
			
			List<Integer> repeated_Lst=new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				
				int count=0;
				for(int j=0;j<n;j++) {
					if(arr[i]==arr[j]&&!repeated_Lst.contains(arr[i])) {
						count++;
						
					}
				}
				if(count==1) {
					repeated_Lst.add(arr[i]);
				}
				
			}
			System.out.println("the non_repeated List");
			return repeated_Lst;
			
		}
		
	}

