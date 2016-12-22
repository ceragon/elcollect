package com.elcolect.jfinal;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;

import demo.HelloController;

public class MyJFinalConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.VELOCITY);
	}

	@Override
	public void configHandler(Handlers arg0) {
		
	}
	/**
	 * 拦截器
	 */
	@Override
	public void configInterceptor(Interceptors arg0) {
		
	}

	@Override
	public void configPlugin(Plugins arg0) {
		
	}
	/**
	 * 路由
	 */
	@Override
	public void configRoute(Routes me) {
		me.add("hello", HelloController.class);
	}
	/**
	 *  起服
	 */
	@Override
	public void afterJFinalStart() {
	}
	/**
	 * 停服
	 */
	@Override
	public void beforeJFinalStop() {
	}
	

}
