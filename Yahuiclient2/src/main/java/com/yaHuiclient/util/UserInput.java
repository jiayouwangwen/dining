package com.yaHuiclient.util;
import java.util.Scanner;

//工具类，用于处理用户输入信息的验证
public class UserInput {
	//接收用户输入的内容string
	public String getString(String msg) {
		System.out.println(msg);
		Scanner input=new Scanner(System.in);
		return  input.next();
	}
	//接收整数
	public int getInt(String msg){
		while(true){
			try {
				System.out.println(msg);
				Scanner input = new Scanner(System.in);
				return input.nextInt();
			} catch (Exception e) {
				System.out.println("输入内容格式不正确，请输入整数类型");
			}
		}
	}
	//接收整数
		public int getInt(){
			while(true){
				try {
					Scanner input = new Scanner(System.in);
					return input.nextInt();
				} catch (Exception e) {
					System.out.println("输入内容格式不正确，请输入整数类型");
				}
			}
		}
	//接收浮点数
	public double getDouble(String msg){
		while(true){
			try {
				System.out.println(msg);
				Scanner input = new Scanner(System.in);
				return input.nextDouble();
			} catch (Exception e) {
				System.out.println("输入内容格式不正确，请输入小数类型");
			}
		}
	}
}
