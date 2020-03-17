package com.capgeminilab13.all;

class ExampleThread extends Thread {
	public void run() {
		for(int i=1;i<6;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" in run"+i);
		}
	}

}

public class ExampleThreadDemo{
	public static void main(String args[]) throws Exception {
		ExampleThread thread = new ExampleThread();
		thread.setName("one");
		thread.start();
		thread.setPriority(Thread.MAX_PRIORITY);
		//thread.join();
		ExampleThread thread1 = new ExampleThread();
		thread1.setName("two");
		thread1.start();
		thread1.join();
		ExampleThread thread2 = new ExampleThread();
		thread2.setName("three");
		thread2.start();
		thread2.join();
		for(int i=1;i<15;i++) {
			System.out.println(Thread.currentThread()+"in main"+i);
		}
	}
}
