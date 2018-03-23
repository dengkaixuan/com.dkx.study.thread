package com.dkx.study.thread;

public class Drop {

	
	private String message;
	private boolean empty = true;
	
	public synchronized String take(){
		while(empty){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		empty = true;
		
		notifyAll();
		
		return message;
	}
	
	
	public synchronized void put(String message){
		while(!empty){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		empty = false;
		this.message = message;
		
		notifyAll();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
