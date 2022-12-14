package com.Sel.org;

public class Array01 {

	static int a1[] = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {

		int i = 100;
		int j[] = { 10, 20, 30 };

		System.out.println(i);
		System.out.println(j[1]);

		for (int x : a1) {
			System.out.println(x);
		}
		for (int j2 = 0; j2 < j.length; j2++) {
			System.out.println(j[j2]);
		}
	}
}
