package com.example.router;

import android.app.Activity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
public class ARouter {

	/*
	 * 需要一个容器，装载所有的Activity.class
	 * */
	private static Map<String, Class<? extends Activity>> activityMap;

	private static ARouter aRouter = new ARouter();

	private ARouter() {
		activityMap = new ConcurrentHashMap<>();
	}

	public static ARouter getInstance() {
		return aRouter;
	}


	/**
	 * 添加Activity.class
	 *
	 * @param key
	 * @param clazz
	 */
	public void addActivity(String key, Class<? extends Activity> clazz) {
		if (clazz != null && key != null && !activityMap.containsKey(key)) {
			activityMap.put(key, clazz);
		}
	}


}
