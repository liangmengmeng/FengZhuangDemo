package com.bwie.fz;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p=new Person();
		p.setAge(120);
		System.out.println("设置年龄不成功时: "+p.getAge());
		p.setAge(21);
		System.out.println("设置年龄成功时: "+p.getAge());
		p.setName("黑士奇");
		System.out.println("设置姓名成功时: "+p.getName());
	}

}
