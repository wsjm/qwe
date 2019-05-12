package com.keduo.dao;

import java.util.Scanner;

public class UserDao {

	static Object[][] users={{"A",12,"��"},{"b",22,"Ů"},{"c",23,"Ů"}};
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
//hahhahaha
		//gagaggagaga
		Test2 test2=new Test2();
		test2.m();

		System.out.println("1.���ܲ˵�");
		System.out.println("2.����û�");

		System.out.println("3嘻嘻嘻爱");
		System.out.println("4.�޸��û�");
		System.out.println("5.啦啦啦啦");
		System.out.println("6.嘎嘎嘎过");
		System.out.println("哈哈哈哈");
		int  n=sc.nextInt();
		switch (n) {
		case 1:
System.out.println("���ܲ˵�");
			break;
		case 2://���
			insert();
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;

		default:
			break;
		}
	}
	//���
	public static void insert(){
		//���������
		
		Object[][] userList=new Object[users.length+1][3];
		System.out.println("--------------");
		for (int i = 0; i < users.length; i++) {
			userList[i]= users[i];
			
			System.out.println(userList.length);
			
		}
		
		while (true) {
			
			System.out.println("��������Ҫ��ӵ��û���:");
			String name=sc.next();
			System.out.println("�������������:");
			int password=sc.nextInt();
			System.out.println("����������Ա�:");
			String sex=sc.next();
			 User user=new User(name,password,sex);
			 
			//System.out.println(userList.length);
			
			
			
		}
		}
	


}
