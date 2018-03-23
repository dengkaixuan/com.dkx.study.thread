package com.dkx.study.thread;
/**
 * 继承Thread类。Thread类自身已实现了Runnable接口，
 * 但它的run()方法中并没有定义任何代码。应用程序可以继承与Thread类，并复写run()方法
 * @author xuan
 *
 */
public class HelloThread extends Thread{

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		(new HelloThread()).start();
//	}
//	
	public void run(){
		System.out.println(Thread.currentThread().getName() + "正在执行。。。");
	}
}
