package com.dkx.study.thread;

public class SleepMessages implements Runnable{

	public static void main(String[] args) throws InterruptedException{
//		String [] importantInfo = {
//				"Mares eat oats",
//				"Does eat oats",
//				"Little lambs eat ivy",
//				"A kid will eat ivy too"
//		};
//		
//		for(int i = 0; i < importantInfo.length; i++){
//			
//			Thread.sleep(4000);
//			System.out.println(importantInfo[i]);
//		}
		
		(new Thread(new SleepMessages())).start();

	}

	@Override
	public void run() {
		
		String [] importantInfo = {
				"Mares eat oats",
				"Does eat oats",
				"Little lambs eat ivy",
				"A kid will eat ivy too"
		};
		
		for(int i = 0; i < importantInfo.length; i++){
			try {
				
				Thread.sleep(4000);
			} catch (Exception e2) {
				return;
			}
			System.out.println(importantInfo[i]);
		}
	}
}
