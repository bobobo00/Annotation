package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo_reflect {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class clz=Class.forName("Annotation.Stu");
		//��ȡ�������ע��
		Annotation[] anno=clz.getAnnotations();
		for(Annotation a:anno) {
			System.out.println(a);
		}
		
		//������ָ��ע��
		StuTable table=(StuTable)clz.getAnnotation(StuTable.class);
		System.out.println(table);
		
		//����������ע��
		Field f=clz.getDeclaredField("name");
		StuField field=f.getAnnotation(StuField.class);
		System.out.println(field.columnName());
		System.out.println(field.length());
		System.out.println(field.type());
	}

}
