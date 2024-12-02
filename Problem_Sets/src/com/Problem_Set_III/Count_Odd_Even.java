package com.Problem_Set_III;

public class Count_Odd_Even {
	
	public String count() {
		System.out.println("question(17)------------------------------");
		int[] arr= {1,5,6,4,78,9,6,3,24};
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		return "the count of even is "+even+" and odd is "+odd;
	}

}
