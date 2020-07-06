package com.yida.barbershop.utils;

import java.util.Random;

public class KeyUtil {
	/**
	 * @return
	 * 生成主键
	 * 格式时间+随机数
	 */
	public static synchronized String getUniqueHey() {
		Random random = new Random();
		//生成六位数随机数
		Integer number = random.nextInt(900000)+100000;
		return System.currentTimeMillis()+String.valueOf(number);
	}
}
