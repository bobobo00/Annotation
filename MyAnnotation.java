package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)//���Ա�������ƶ�ȡ
public @interface MyAnnotation {
	String value() default " ";//����,ʹ�ø�ע��ʱ��û�ж��������Ĭ��ָ��Ϊ" "
	//int age() default 0;
	//int id() default -1;//-1��ʾ�ò�����
	//String[] school() default {"1","2"};

}

class Demo{
	@MyAnnotation("1")//ע�������Ϊvalue(ֻ��һ������)ʱ��ʹ��ʱ����ָ��������
	public static void test() {
		
	}
}