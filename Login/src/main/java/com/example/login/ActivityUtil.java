package com.example.login;

import com.example.router.ARouter;
import com.example.router.IRouter;

public class ActivityUtil implements IRouter {
	@Override
	public void putActivity() {
		/*key值是需要统一标准*/
		ARouter.getInstance().addActivity("login/login", LoginActivity.class);
		/*更多的Activity，需要一个个添加，很麻烦，这个时候APT技术就要起作用了*/
		ARouter.getInstance().addActivity("login/login", LoginActivity.class);
		ARouter.getInstance().addActivity("login/login", LoginActivity.class);
		ARouter.getInstance().addActivity("login/login", LoginActivity.class);
		ARouter.getInstance().addActivity("login/login", LoginActivity.class);
		
	}
}
