package com.dkx.study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleThreadExecutor {

	public static void main(String[] args) {
//		//创建一个可重用固定线程数的线程池
//        ExecutorService pool = Executors.newSingleThreadExecutor();
//        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
//        Thread t1 = new HelloThread();
//        Thread t2 = new HelloThread();
//        Thread t3 = new HelloThread();
//        Thread t4 = new HelloThread();
//        Thread t5 = new HelloThread();
//        //将线程放入池中进行执行
//        pool.execute(t1);
//        pool.execute(t2);
//        pool.execute(t3);
//        pool.execute(t4);
//        pool.execute(t5);
//        //关闭线程池
//        pool.shutdown();
		
//		//创建一个可重用固定线程数的线程池
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
//        Thread t1 = new HelloThread();
//        Thread t2 = new HelloThread();
//        Thread t3 = new HelloThread();
//        Thread t4 = new HelloThread();
//        Thread t5 = new HelloThread();
//        //将线程放入池中进行执行
//        pool.execute(t1);
//        pool.execute(t2);
//        pool.execute(t3);
//        pool.execute(t4);
//        pool.execute(t5);
//        //关闭线程池
//        pool.shutdown();
		
//		//创建一个可重用固定线程数的线程池
//        ExecutorService pool = Executors.newCachedThreadPool();
//        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
//        Thread t1 = new HelloThread();
//        Thread t2 = new HelloThread();
//        Thread t3 = new HelloThread();
//        Thread t4 = new HelloThread();
//        Thread t5 = new HelloThread();
//        //将线程放入池中进行执行
//        pool.execute(t1);
//        pool.execute(t2);
//        pool.execute(t3);
//        pool.execute(t4);
//        pool.execute(t5);
//        //关闭线程池
//        pool.shutdown();
		//获取系统可用处理器核心数
		Runtime.getRuntime().availableProcessors();
		
		//创建一个可重用固定线程数的线程池
        ExecutorService pool = Executors.newScheduledThreadPool(3);
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
        Thread t1 = new HelloThread();
        Thread t2 = new HelloThread();
        Thread t3 = new HelloThread();
        Thread t4 = new HelloThread();
        Thread t5 = new HelloThread();
        //将线程放入池中进行执行
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        //关闭线程池
        pool.shutdown();
        
        
	}
}
