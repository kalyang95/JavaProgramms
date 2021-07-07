package com.thread;

public class MyData {
	synchronized public void display(String str) throws InterruptedException {
		for(int i = 0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			Thread.sleep(100);
		}
		System.out.println();
	}
}
