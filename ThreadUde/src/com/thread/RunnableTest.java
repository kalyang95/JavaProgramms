package com.thread;

public class RunnableTest  {

	public static void main(String[] args) {
		RunThread t = new RunThread();
		Thread th = new Thread(t);
		th.start();
		int i = 1;
		while(true) {
			System.out.println(i+".)World");
			i++;
		}
	}
}
