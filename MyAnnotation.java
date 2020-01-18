package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)//可以被反射机制读取
public @interface MyAnnotation {
	String value() default " ";//参数,使用该注解时若没有定义参数在默认指定为" "
	//int age() default 0;
	//int id() default -1;//-1表示该不存在
	//String[] school() default {"1","2"};

}

class Demo{
	@MyAnnotation("1")//注解参数名为value(只有一个参数)时，使用时无须指定参数名
	public static void test() {
		
	}
}