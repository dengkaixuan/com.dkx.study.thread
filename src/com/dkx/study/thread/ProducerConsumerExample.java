package com.dkx.study.thread;

public class ProducerConsumerExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Drop drop = new Drop();
		//(new Thread(new Consumer(drop))).start();
		
		//(new Thread(new Producer(drop))).start();
		
		//获取系统可用处理器核心数
		Runtime.getRuntime().availableProcessors();
		
		JoinThread counter1 = new JoinThread();
		JoinThread counter2 = new JoinThread();
		JoinThread counter3 = new JoinThread();
		
		counter1.setName("counter1_");
		counter2.setName("counter2_");
		counter3.setName("counter3_");
		
		counter1.start();
		//counter1.join();
		counter2.start();
		//counter2.join();
		counter3.start();
		//counter3.join();
	}

}
