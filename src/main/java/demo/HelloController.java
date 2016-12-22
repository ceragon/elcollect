package demo;

import com.jfinal.core.Controller;

public class HelloController extends Controller{
	public void index() {
		renderText("hello nihao!!!");
	}
	public void name() {
		renderText("ÊÇÂð");
	}
}
