package com.bwie.fz;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p=new Person();
		p.setAge(120);
		System.out.println("�������䲻�ɹ�ʱ: "+p.getAge());
		p.setAge(21);
		System.out.println("��������ɹ�ʱ: "+p.getAge());
		p.setName("��ʿ��");
		System.out.println("���������ɹ�ʱ: "+p.getName());
	}

}
