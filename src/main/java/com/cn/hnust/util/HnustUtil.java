package com.cn.hnust.util;

import java.util.Random;
import java.util.UUID;

public class HnustUtil {

	public static String createId(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static String redomnum(){
		StringBuilder str=new StringBuilder();//定义变长字符串
		Random random=new Random();
		//随机生成数字，并添加到字符串
		for(int i=0;i<8;i++){
		    str.append(random.nextInt(10));
		}
		//将字符串转换为数字并输出
		String num=String.valueOf(Integer.parseInt(str.toString()));
		System.out.println(num);
		return num;
	}
	
}
