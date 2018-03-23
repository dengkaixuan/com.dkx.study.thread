package com.dkx.study.thread;

import java.util.Random;

public class Producer implements Runnable{

	private Drop drop;

	public Producer(Drop drop) {
		// TODO Auto-generated constructor stub
		this.drop = drop;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String importantInfo[] = {
			"Mares eat oats",
			"Does eat oats",
			"Little lambs eat ivy",
			"A kid will eat ivy too"
		};
		Random random = new Random();
		
		for(int i = 0; i<importantInfo.length; i++){
			drop.put(importantInfo[i]);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		drop.put("DONE");
	}
}
