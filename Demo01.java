package Annotation;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	
	@Override//���ڱ�ʾ�����θ÷���Ϊ��д����ķ��������÷����ڸ����в�������ᱨ��
	public String toString() {
		test();
		return "";
	}
	@Deprecated//��Ǹ÷������Ƽ�ʹ��
	public static void test() {
		
	}
	@SuppressWarnings("all")//���Ʊ����쳣
	public static void test01() {
		List list=new ArrayList();
	}
}
