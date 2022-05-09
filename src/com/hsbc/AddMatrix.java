// 5. Java Program to add two matrix using multi dimensional arrays
package com.hsbc;

public class AddMatrix {

	public static void main(String[] args) {

		int [][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
		};

		int [][] b = {
				{2,2,2},
				{2,2,2},
				{2,2,2}
		};

		System.out.println("==Matrix A==");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("==Matrix B==");
		for(int i=0; i<b.length;i++) {
			for(int j=0; j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		int[][] c = new int [3][3];

		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
			System.out.println();
		}

		System.out.println("==Matrix C==");
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
