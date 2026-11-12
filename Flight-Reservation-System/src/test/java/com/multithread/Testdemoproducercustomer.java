package com.multithread;
class Resource{
	int i=0;
	void put(int i) {
		this.i=i;
		System.out.println("PUT:"+i);
	}
	void get() {
		System.out.println("GET:"+i);
	}
}
class Producer implements Runnable{
	Resource r;
	Producer(Resource r){
		this.r=r;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			r.put(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
	
	class Consumer implements Runnable{
		Resource r;
		Consumer(Resource r){
			this.r=r;
			Thread t=new Thread(this,"Consumer");
			t.start();
		}
		@Override
		public void run() {
			
			while(true) {
				r.get();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		}
public class Testdemoproducercustomer {

	public static void main(String[] args) {
		System.out.println("main method started");
		Resource r=new Resource();
		Producer p1=new Producer(r);
		Consumer c1=new Consumer(r);
		

	}

}
	



