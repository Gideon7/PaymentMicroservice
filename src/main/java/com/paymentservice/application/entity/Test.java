package com.paymentservice.application.entity;

public class Test {
	public static void main(String[] args) {
		String words = "fimile this world is mine";
//		char[] characters = words.toCharArray();
//		for (char wds : characters) {
//			System.out.print(Character.toUpperCase(wds));
//		}
		String[] word = words.split("\s");
		for (String w : word) {
//			System.out.println(w.charAt(0));
			System.out.println(w.substring(0,1).toUpperCase() +w.substring(1));
		}
	}
}
