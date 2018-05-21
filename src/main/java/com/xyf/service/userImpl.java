package com.xyf.service;

import com.xyf.ifac.user;

public class userImpl implements user {
	
	Integer count = 0;

	public void add(int i) {
		synchronized (count) {
			count += i;
			System.out.println(count+"");
		}
	}

}
