package com.thread;

public class RunThread implements Runnable{
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i+".)Hello");
			i++;
		}
	}
}
