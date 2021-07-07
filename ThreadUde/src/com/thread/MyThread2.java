package com.thread;

public class MyThread2 extends Thread{
	MyData d;
	public MyThread2(MyData d) {
		this.d = d;
	}
	public void run() {
		try {
			d.display("Welcome");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
