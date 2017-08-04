package com.dkx.study.thread;

public class SimpleThreads {

	
	static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s：%s%n",threadName,message);
	}
	
	private static class MessageLoop implements Runnable{
		@Override
		public void run() {
			String importantInfo[] = {
					"Mares eat oats",
					"Dose eat oats",
					"Little lambs eat ivy",
					"A kid will eat ivy too",
					"sdfsdfasdfm,nnishuoshenme nishuosehmasdf"
			};
			try {
				for(int i = 0; i < importantInfo.length; i++){
					Thread.sleep(5000);
					threadMessage(importantInfo[i]);
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
				threadMessage("I wasn't done !");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		long patience = 1000 * 60 * 60;
		if(args.length > 0){
			try {
				patience = Long.parseLong(args[0]) * 1000;
			} catch (NumberFormatException e) {
				System.err.println("Starting MessageLoop thread");
				System.exit(1);
			}
		}
		
		threadMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		threadMessage("Waiting for MessageLoop thread to finish");
		while(t.isAlive()){
			threadMessage("Still waiting...");
			
			t.join(1000);
			if(((System.currentTimeMillis() - startTime) > patience) && t.isAlive()){
				threadMessage("Tired of waiting");
				t.interrupt();
				t.join();
			}
		}
		threadMessage("Finally!");
	}
}
