package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo_reflect {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class clz=Class.forName("Annotation.Stu");
		//获取类的所有注解
		Annotation[] anno=clz.getAnnotations();
		for(Annotation a:anno) {
			System.out.println(a);
		}
		
		//获得类的指定注解
		StuTable table=(StuTable)clz.getAnnotation(StuTable.class);
		System.out.println(table);
		
		//获得类的属性注解
		Field f=clz.getDeclaredField("name");
		StuField field=f.getAnnotation(StuField.class);
		System.out.println(field.columnName());
		System.out.println(field.length());
		System.out.println(field.type());
	}

}
