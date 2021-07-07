package com.threads;

import static com.threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{

	@Override
	public void run() {
		System.out.println(ANSI_BLUE + " Hello from " + currentThread().getName());
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println("Another Thread woke me up");
			return;
		}
		
		System.out.println("Three seconds have passed and I am awake");
	}
	
}
