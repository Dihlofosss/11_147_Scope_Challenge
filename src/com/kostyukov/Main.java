package com.kostyukov;

import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Please enter the number ");
		X x = new X(scanner.nextInt());
		scanner.nextLine();
		
		x.x();
	}
}
