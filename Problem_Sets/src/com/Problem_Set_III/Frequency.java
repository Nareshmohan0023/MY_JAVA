package com.Problem_Set_III;

public class Frequency {
	public void Find_Frequency() {
		System.out.println();
    	System.out.println("question(9)----------------------------");
	    int[] array = {2, 3, 2, 3, 5, 6, 3};
	    int n=array.length;
	    Boolean[] array_D=new Boolean[n];
//	    setting every element as false
	    for(int k=0;k<n;k++) {
	    	array_D[k]=false;
	    }
	    
	    for(int i=0;i<n;i++) {
	    	if(array_D[i]) {
	    		continue;
	    	}
	    	int count=1;
	    	for(int j=i+1;j<n;j++) {
	    		if(array[i]==array[j]) {
	    			count++;
	    			array_D[j]=true;
	    			
	    		}
	    	}
	    	System.out.println("The frequency of element "+array[i]+ " is "+ count);
	    }
	}

}
