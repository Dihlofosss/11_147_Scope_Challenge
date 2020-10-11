package com.kostyukov;

import java.util.Scanner;

public class Main {
	
	public static Scanner x = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Please enter the number ");
		new X(x.nextInt());
	}
	
	public static class X
	{
		private int x;
		
		public X(int x)
		{
			this.x = x;
			x();
		}
		
		public void x()
		{
			System.out.println("Times table for " + x);
			for (int x = 1; x <= 12; x++)
			{
				System.out.println(this.x + " * " + x + " = " + this.x * x);
			}
		}
	}
}
