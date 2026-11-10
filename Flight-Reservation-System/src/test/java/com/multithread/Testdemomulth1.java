package com.multithread;

public class Testdemomulth1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("run:"+Thread.currentThread().getName()+ "->" +i);
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Testdemomulth1 t=new Testdemomulth1();
		t.start();
		t.interrupt();
		t.main();
		System.out.println("main method started");
		}
	public void main() {
		for(int i=0;i<=5;i++) {
			System.out.println("main:"+Thread.currentThread().getName()+ "->" +i);
			Thread.yield();
			
		}
	}
	
}
