package com.syntax.class03;

public class CompoundOperator {
	public static void main(String[] args) {

		int num = 100;
		num = num + 100; // 200
		System.out.println(num);

		num = num + 100;
		System.out.println(num);

		// we can use Compound operators which are shorter
		num += 100;//
		System.out.println(num); // 400

		// long way
		// num = num - 50;

		// short way
		num -= 50;
		System.out.println(num); // 350

		num /= 7;
		System.out.println(num);// 50

		num *= 2;
		System.out.println(num);// 100

		num %= 9;
		System.out.println(num); // 1

		System.out.println("---------------");

		// 1. Declare variable and increase by 100 using shorthand operator
		int i = 10;
		i += 100;
		System.out.println(i);

		// 2. Declare variable and decrease by 67 using shorthand operator

		int j = 20;
		j -= 10;
		System.out.println(j);

		// 3. Declare variable cakePiece=11 and divide cakePiece between 4 people
		// using shorthand operator
		// each person should get an equal piece of cake

		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);

		// 4. Declare variable cakePiece=25 and divide cakePiece between 7 people .
		// Using shorthand operator found out how many pieces of cake left after
		// it was distributed equally among 7 people
		
		int cakePiece1 = 25;
		cakePiece1 %= 7;
		System.out.println(cakePiece1);
		

	}

}
