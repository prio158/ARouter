package com.example.router;


/**
 * 各个模块需要实现这个接口，这个各个模块实现该方法，将Activity.class添加到ARouter的容器
 */
public interface IRouter {
	void putActivity();
}
