package com.Problem_Set_I;

public class Set_I_Main {

	public static void main(String[] args) {
		Set_I_Main obj =new Set_I_Main();
		Postive_or_negaive obj1 = new Postive_or_negaive();
		obj1.Pos_neg(5);
		Odd_even obj2=new Odd_even();
		System.out.println(obj2.Oddoreven(6));
		Sum_of_N obj3 =new Sum_of_N();
		System.out.println(obj3.Sumofnaturalnumbers(3));
		Greatest_Two_Num obj4=new Greatest_Two_Num();
		System.out.println(obj4.Greatest_of_two(7, 8));
		Sum_of_givenInterval obj5=new Sum_of_givenInterval();
		System.out.println(obj5.Sum_of_interval(3,6));
		Greatest_of_three obj6=new Greatest_of_three();
		System.out.println(obj6.GOT_3(5,8,7));
		Leap_Year obj7=new Leap_Year();
		System.out.println(obj7.Leapyear(2020));
		Prime_or_not obj8=new Prime_or_not();
		System.out.println(obj8.Is_Prime(7));
		Sum_of_prime_interval obj9= new Sum_of_prime_interval();
		System.out.println(obj9.Sum(2, 26));
		Sum_of_digits obj10=new Sum_of_digits();
		System.out.println(obj10.Sum(222));
		

	}

}