package Annotation;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	
	@Override//用于表示和修饰该方法为重写父类的方法，若该方法在父类中不存在则会报错。
	public String toString() {
		test();
		return "";
	}
	@Deprecated//标记该方法不推荐使用
	public static void test() {
		
	}
	@SuppressWarnings("all")//抑制编译异常
	public static void test01() {
		List list=new ArrayList();
	}
}
