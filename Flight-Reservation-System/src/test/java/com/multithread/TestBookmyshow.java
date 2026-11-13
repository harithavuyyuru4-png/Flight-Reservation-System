package com.multithread;
class Bookmyshow{
	int total_tickets=10;
	synchronized void BookmyTickets(String name,int tickets ) {
		if(total_tickets>=tickets) {
			System.out.println(name + "booked" + tickets +"tickets successfully");
			total_tickets = total_tickets - tickets;
			System.out.println("Remaining tickets are available:"+total_tickets);
		}else {
			System.err.println("the tickets are sold out");
			System.err.println("the remaining sold!!mr"+name);
		}
}
}
class Customer extends Thread{
	String customername;
	Bookmyshow bms;
	int tickets;
	public Customer(String customername, Bookmyshow bms, int tickets) {
		super();
		this.customername = customername;
		this.bms = bms;
		this.tickets = tickets;
	}
@Override
	public void run() {
	bms.BookmyTickets(customername,tickets);
	}
	
}
public class TestBookmyshow {

	public static void main(String[] args) {
		
		Bookmyshow bms=new Bookmyshow();
		System.out.println("welcome to bookmyshow");
		Customer c1=new Customer("haritha",bms,6);
          c1.start();
          Customer c2=new Customer("hari",bms,4);
          c2.start();
          Customer c3=new Customer("ha",bms,4);
          c3.start();
          
	}

}
