package com.dkx.study.thread;

public class JoinThread extends Thread{

	private int count = 0;
	public void run(){
		while(true){
			if("counter1_".equals(this.getName())){
				//System.out.println("执行");
				str1(this.getName());
			}else if("counter2_".equals(this.getName())){
				//System.out.println("执行");
				str1(this.getName());
			}else if("counter3_".equals(this.getName())){
				//System.out.println("执行");
				str1(this.getName());
			}
			++count;
			//System.out.println(this.getName()+(++count));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			if(count==3)
				return;
		}
	}
	
	private void str1(String name){
		System.out.println(this.getName()+(++count));
	}
	
	private void str2(String name){
		System.out.println(this.getName()+(++count));
	}
	
	private void str3(String name){
		System.out.println(this.getName()+(++count));
	}
}
