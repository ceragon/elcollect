package com.elcolect.server.jfinal.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jfinal.core.Controller;

public class HelloController extends Controller{
	private final static Logger log=LogManager.getLogger(HelloController.class);
	public void index() {
		renderText("hello nihao!!!");
		log.error("niasdfddddddddddddddd");
	}
	public void name() {
		renderText("hello");
	}
}
