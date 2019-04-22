package com.yaHuiclient.view;

import java.util.List;

public class View {
	//打印字符串方法
	public void println(String msg) {
		System.out.println(msg);
	}
	//打印对象的方法
	public void printlnObjest(Object msg) {
		System.out.println(msg);
	}
	//显示数组输出
	public void showArray(List list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	//登录界面
	public void up(){
		System.out.println("******欢迎进入亚惠餐厅******");
		System.out.println(">>选择登录角色");
		System.out.println("1、员工登录");
		System.out.println("2、经理登录");
	}
	//普通员工界面
	public void welcome(){
		System.out.println("******欢迎进入亚惠餐厅******");
		System.out.println("========================");
		System.out.println("1、为客人开卡");
		System.out.println("2、会员卡充值");
		System.out.println("3、会员卡挂失");
		System.out.println("4、客人点餐");
		System.out.println("5、结账打印小票");
		System.out.println("========================");
	}
	
	
	//经理界面
	public void manager() {
		System.out.println("1、普通员工管理");
		System.out.println("2、客户管理");
		System.out.println("3、菜品管理");
		
	}
	//经理对普通员工的管理
	public  void manager1(){
		System.out.println("1、增加普通员工");
		System.out.println("2、修改员工信息");
		System.out.println("3、查看所有员工信息");
		System.out.println("4、删除员工信息");
	}
	//经理对客户的管理
	public void manager2(){
		System.out.println("1、客户补卡");
		System.out.println("2、设置会员额度");
		System.out.println("3、客户冻结");
		System.out.println("4、客户查询");
	}
	//经理对菜品的管理
	public void manager3(){
		System.out.println("1、特价菜设置");
		System.out.println("2、销量统计");
		System.out.println("3、查看菜品");
		System.out.println("4、修改菜品");
	}
	
	//点餐界面
	public void orderFood(){
		System.out.println("***欢迎进入点餐界面***");
		System.out.println("1、肉菜类");
		System.out.println("2、素菜类");
		System.out.println("3、主食类");
		System.out.println("4、汤类");
	}
	//肉菜类
	public void meat(){
		System.out.println("101、红烧肉");
		System.out.println("102、水煮肉片");
		System.out.println("103、小鸡炖蘑菇");
		System.out.println("104、狮子头");
		System.out.println("105、京酱肉丝");
		System.out.println("106、烤羊排");
		System.out.println("输入0跳出");
	}
	//素菜类
	public void green(){
		System.out.println("201、炒土豆丝儿");
		System.out.println("202、浇汁香菇油菜");
		System.out.println("203、麻婆豆腐");
		System.out.println("204、南瓜炖土豆");
		System.out.println("205、红烧茄子");
		System.out.println("206、西红柿炒鸡蛋");
		System.out.println("输入0跳出");
	}
	//主食类
	public void noodles(){
		System.out.println("301、馒头");
		System.out.println("302、烧饼");
		System.out.println("303、花卷");
		System.out.println("304、米饭");
		System.out.println("305、油条");
		System.out.println("306、饺子");
		System.out.println("输入0跳出");
	}
	//汤类
	public void soup(){
		System.out.println("401、鸭血粉丝汤");
		System.out.println("402、西红柿鸡蛋面疙瘩汤");
		System.out.println("403、排骨汤");
		System.out.println("404、花谷猪蹄汤");
		System.out.println("405、补血乌鸡汤");
		System.out.println("406、羊骨汤");
		System.out.println("输入0跳出");
	}
	
}





















