package com.Algorithm;

import java.util.Scanner;

public class BubbleSortTest {
static Scanner scan = new Scanner(System.in);
	
	public static void display(int [] array) {
		for (int j : array) {
			System.out.print(" " + j);			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSort sort = new BubbleSort();
		int array[] = {40, 30, 70, 50, 22, 65};
		
		sort.sort(array);
		display(array);
	}


}
