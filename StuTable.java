package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)//可以被反射机制读取
public @interface StuTable {
	String value();
}
