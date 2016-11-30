package com.bwie.fz;

public class Person {
	public String name;
	public int age;
	public void setName(String name){
		if (name.length()>6||name.length()<2) {
			System.out.println("你的设置不符合要求");
			return;
		}else{
			this.name=name;
		}
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		if (age>100||age<0) {
			System.out.println("你设置的年龄不合法");
			return;
		}else{
			this.age=age;
		}
	}
	public int getAge(){
		return this.age;
	}
}
