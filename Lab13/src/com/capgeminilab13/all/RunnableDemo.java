package com.capgeminilab13.all;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<10;i++) {
			if(i==2) {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread()+"-run-"+i);
			}
		}
		
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10;i++) {
		MyRunnable thread = new MyRunnable();
		thread.run();
		System.out.println(Thread.currentThread()+"-main-");
		}

	}

}
