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
		obj9.Sum(2, 26);
		Sum_of_digits obj10=new Sum_of_digits();
		System.out.println(obj10.Sum(222));
		Reverse_of_number obj11=new Reverse_of_number();
		obj11.Reverse(256);
		Palindrome_of_num obj12=new Palindrome_of_num();
		System.out.println(obj12.Is_palindrome(262));
		Armstrong_number obj13=new Armstrong_number();
		System.out.println(obj13.Find_Armstrong(153));
		Find_All_Armstrong obj14=new Find_All_Armstrong();
		obj14.Find_Armstrongs(2, 200);
		Fibonacci_Series obj15=new Fibonacci_Series();
		obj15.printFibonacci(10);
		Nth_term_Fibonacci obj16=new Nth_term_Fibonacci();
		obj16.Nth_term(10);
		Factorial obj17=new Factorial();
		System.out.println(obj17.Factorial_N(6));
		Power_of_num obj18=new Power_of_num();
		System.out.println(obj18.power(2, 3));
		Factor_of_n obj19=new Factor_of_n() ;
		obj19.factor(12);
		Strong_number obj20=new Strong_number();
		obj20.isStrongNumber(145);
		Perfect_Number obj21=new Perfect_Number();
		System.out.println(obj21.Is_perfect_number(6));
		Perfect_Square obj22=new Perfect_Square();
		System.out.println(obj22.Is_perfect_square(81));
		Harshad_Number obj23=new Harshad_Number();
		System.out.println(obj23.Is_Harsad_Number(13));
		Abundant_number obj24=new Abundant_number();
		System.out.println(obj24.Is_Abundant_Number(6));

	}

}
