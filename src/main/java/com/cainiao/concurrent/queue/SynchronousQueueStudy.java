package com.cainiao.concurrent.queue;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author vinfai
 *
 */
public class SynchronousQueueStudy {

	public static void main(String[] args) {

ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 2,200, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>(true),
				new ThreadPoolExecutor.AbortPolicy());
		
		executor.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"running....");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"running3....");
			}
		});
		//corePool thread ռ�ã����п�
		System.out.println(executor);
		
		//corePool thread ռ�ã�����ռ����
		executor.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"running2....");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		System.out.println(executor);
		//corePool thread ռ�ã�����ռ����,maxPoolSize��,����rejectPolicy
		try {
			executor.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+"running4444....");
				}
				@Override
				public String toString(){
					return Thread.currentThread().getName();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(executor);
		
	}
}
