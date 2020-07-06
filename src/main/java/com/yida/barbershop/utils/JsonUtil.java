package com.yida.barbershop.utils;


import com.google.gson.GsonBuilder;

/**
*@author : zhuquanzhen
*@version :2020年4月16日上午1:59:55
*/
public class JsonUtil {
	private static GsonBuilder gsonBuilder = new GsonBuilder();
	
	public static String toJson(Object object) {
		gsonBuilder.setPrettyPrinting();
		return gsonBuilder.create().toJson(object);
	}
}
