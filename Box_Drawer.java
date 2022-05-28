package org.env.testing;

import java.util.Scanner;

public class Assigment1p2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		boolean stop = true;

		while(stop) {
			
			System.out.println("Enter hight");
			int hight = input.nextInt();
			System.out.println("Enter Width");
			int width = input.nextInt();
			int less = width - 1;
			int sLess = hight - 1;	
			
			
		// prints the hight
			if(hight <= 100 && width <= 100) {
				for(int i = 0; i< hight; i++) {
					for(int j = 0; j < width; j ++) {
						if (i == 0 || i == sLess){
							// prints first and last line of A 
							System.out.print("A");
						}
						
						
					}
					for(int y = 0; y < width; y++) {
						//below is the conter that starts the loop right after the first loop and ends it as the first loop goes again
						if (i > 0 && i < sLess){
							 if (y == 0 || y == less){
									System.out.print("A");
							}
							 if (y > 0 && y < less ){
									System.out.print(" ");
							}
						}
					}
					//this here is to make sure it goes on another line
					System.out.print("\r\n");
					}
				
			}else if(hight > 100 || width > 100){
				System.out.println("Cannot go over 100");

			
			
			}
		
		
		input.close();

	}

	}}
