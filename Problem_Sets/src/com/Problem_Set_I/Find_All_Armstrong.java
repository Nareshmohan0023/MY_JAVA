package com.Problem_Set_I;

public class Find_All_Armstrong {
	public boolean Is_Armstrong(int n) {
		
		int orginal=n;
		int sum=0;
		int digits;
		digits=String.valueOf(n).length();
		while(n!=0) {
			sum+=Math.pow((n%10),digits);
			n=n/10;
		}
		if(orginal==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public void Find_Armstrongs(int a,int b){
		System.out.println("--------------------------------");
		System.out.println("The armstrong number between : "+a+" and "+b);
		int temp;
		if(a>b) {
			temp=b;
			b=a;
			a=temp;
		}
		for(int i=a;i<=b;i++) {
			if(Is_Armstrong(i)) {
				System.out.print( i+"  ");
			}
			
		}
		
	}

}