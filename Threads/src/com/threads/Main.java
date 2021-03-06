package com.threads;

import static com.threads.ThreadColor.ANSI_PURPLE;
import static com.threads.ThreadColor.ANSI_GREEN;
import static com.threads.ThreadColor.ANSI_RED;

public class Main {
	public static void main(String[] args) {
		System.out.println(ANSI_PURPLE + " Hello from the main thread");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("== AnotherThread ==");
		anotherThread.start();
		
		new Thread() {
			public void run() {
				System.out.println(ANSI_GREEN + " Hello from the anonymous class");
			}
		}.start();
		
		Thread runnableThread = new Thread(new MyRunnable() {

			@Override
			public void run() {
				System.out.println(ANSI_RED+ " Hello from the anonymous class's implementation of run()");
				try {
					anotherThread.join(2000);
					System.out.println("Another Thread terminated, so I am running here");
				}catch(InterruptedException e) {
					System.out.println("I was interrupted");
				}
			}
			
		});
		runnableThread.start();
		
		
		System.out.println(ANSI_PURPLE +" Hello again from the main Thread");
		
		
	}
}
