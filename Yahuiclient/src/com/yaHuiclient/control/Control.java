package com.yaHuiclient.control;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiclient.control.*;
import com.yaHuiclient.util.UserInput;
import com.yaHuiclient.view.View;

public class Control {
	//客户端
	private View v;
	private UserInput ui;
	 private final int PORT=9999;
     private final String Ip="10.10.49.33";
     private yaHuiService service;
     public Control() {
 		super();
 		this.v = new View();
 		this.ui = new UserInput();
 		//创建代理对象
 		this.service=Proxyclient.getClient(yaHuiService.class, Ip , PORT);
 	}
     
     public void start(){
    	 while(true){
    		 this.v.up();
    		 int n=this.ui.getInt("请选择：");
    loopss:	 if(n==1){
    			 while(true){
    				 int eid = this.ui.getInt("请输入员工id编号:");
    				 String password = this.ui.getString("请输入员工密码:");
    				 String str = this.service.logEm(eid, password);
    				 if(str!=null){
    					 break;
    				 }
    				 this.v.println("id或密码错误，重新输入");
    			 }
    			 //选择1，普通员工界面
    			 while(true){
    	    	 this.v.welcome();
    	    		 int i=this.ui.getInt("请选择：");
    	    		 if(i==0){
    	         		this.v.println("系统中止");
    	         		System.exit(0);
    	         	}else if(i==1){
    	         		String ac = this.addCard();
    	         		this.v.println(ac);
    	         	}else if(i==2){
    	         		String  vs = this.congZhi();
    	         		this.v.println(vs);
    	         	}else if(i==3){
    	         		String dc = this.deleteCard();
    	         		this.v.println(dc);
    	         	}else if(i==4){
    	    loop:           while(true){
    	        			this.v.orderFood();
    	        		    this.v.println("输入0返回上一层");
    	        			int m = this.ui.getInt("请选择：");
    	    loops:			if(m==0){
    	        				break loop;
    	        		    }else if(m==1){
    	        				this.v.meat();
    	        				int j = this.ui.getInt("如果不想选菜了，按0退回上一层，否则按任意键继续");
    	        				if(j==0){
    	        					break loops;
    	        				}else{
    	        					this.orderFood();
    	        				}
    	        			}else if(m==2){
    	        				this.v.green();
    	        				int j = this.ui.getInt("如果不想选菜了，按0退回上一层，否则按任意键继续");
    	        				if(j==0){
    	        					break loops;
    	        				}else{
    	        					this.orderFood();
    	        				}
    	        			}else if(m==3){
    	        				this.v.noodles();
    	        				int j = this.ui.getInt("如果不想选菜了，按0退回上一层，否则按任意键继续");
    	        				if(j==0){
    	        					break loops;
    	        				}else{
    	        					this.orderFood();
    	        				}
    	        			}else if(m==4){
    	        				this.v.soup();
    	        				int j = this.ui.getInt("如果不想选菜了，按0退回上一层，否则按任意键继续");
    	        				if(j==0){
    	        					break loops;
    	        				}else{
    	        					this.orderFood();
    	        				}
    	        			}else {
    	        				this.v.println("输入错误，重新输入");
    	        			}	
    	        	 }
    	         	}else if(i==5){
    	         		//打印小票
    	         		this.printTicket();
    	         	}else{
    	         		break loopss;
    	         	}
    	    	 }
    		 }else if(n==2){
    			 while(true){
    				 int eid = this.ui.getInt("请输入经理id编号:");
    				 String password = this.ui.getString("请输入经理密码:");
    				 String str = this.service.logM(eid, password);
    				 if(str!=null){
    					 break;
    				 }
    				 this.v.println("id或密码错误，重新输入");
    			 }
    			 while(true){
    			 this.v.manager();
    			 int i = this.ui.getInt("请选择：");
    			 if(i==1){
    				 //经理对普通员工的管理
    				 this.v.manager1();
    				 int j = this.ui.getInt("请选择：");
    				 if(i==1){
    					 //添加员工信息
    					 String  str= this.addEmployee();
    					 this.v.println(str);
    				 }else if(i==2){
    					 //修改员工信息
    					 String s = this.alterEmployee();
    					 this.v.println(s);
    				 }else if(i==3){
    					 //查看所有员工的信息
    					 this.selectAllemployee();
    				 }else if(i==4){
    					 //删除员工的信息
    					 String  s= this.deleteEmployee();
    					 this.v.println(s);
    				 }else {
    					 this.v.println("输入错误");
    					 return;
    				 }
    					 
    			 }else if(i==2){
    				//经理对客户的管理
    				 this.v.manager2();
    				 int j = this.ui.getInt("请选择：");
    				 if(j==1){
    					 //客人补卡
    					 this.buCard();
    				 }else if(j==2){
    					 //设置优惠额度
    					 this.upMember();
    				 }else if(j==3){
    					 //客户冻结
    					 this.frezzCustumerByM();
    				 }else if(j==4){
    					 //客户查询
    					 this.selectCustumer();
    				 }else{
    					 return;
    				 }
    			 }else if(i==3){
    				//经理对菜品的管理
    				this.v.manager3();
    				int j = this.ui.getInt("请选择：");
	    				if(j==1){
	    					//特价菜设置
	    					this.upDisc();
	    				}else if(j==2){
	    					//销量统计
	    					this.findSalesByM();
	    				}else if(j==3){
	    					//查看菜品
	    					this.findFoodByM();
	    				}else if(j==4){
	    					//修改菜品
	    					this.alterFood();
	    					
	    				}else{
	    					return;
	    				}
    			 }else if(i==0){
    				 break loopss;
    			 }
    			 }
    		 }else if(n==0){
    			 this.v.println("系统中止");
	         		System.exit(0);
    		 }else{
    			 System.out.println("输入错误，请重新输入");
    		 }
    	 }
    	 
     }
    
	//修改菜品
     private void  alterFood() {
		int id = this.ui.getInt("输入菜品id编号");
		String name= this.ui.getString("修改菜品的名称为");
		double price = this.ui.getDouble("修改菜品的价格为");
		this.v.println( this.service.upFood(id, name, price));
		
	}

	//查询菜品
     private void findFoodByM() {
		List<food> food = this.service.findFoodByM();
		this.v.showArray(food);
	}

	//销量统计
     private void findSalesByM() {
		
		
	}

	//设置特价菜
     private void upDisc() {
    	 int id = this.ui.getInt("输入特价菜菜品id编号:");
 		String name= this.ui.getString("修改特价菜菜品的名称为:");
 		double price = this.ui.getDouble("修改特价菜菜品的价格为:");
 		this.v.println( this.service.upFood(id, name, price));
	}

	//查询客户方法
     private void selectCustumer() {
		int cid = this.ui.getInt("输入要查询的客户的id:");
		this.service.findCustumerByE(cid);
		
	}

	//客户冻结
     private void frezzCustumerByM() {
		int mid = this.ui.getInt("输入客户的id编号");
		int i= this.ui.getInt("输入卡冻结状态(0(正常)/1(冻结))");
		String str = this.service.frezzCustumerByM(mid,i);
		this.v.println(str);
	}

	//设置优惠额度
     private void upMember() {
		int melevel = this.ui.getInt("输入客户会员等级");
		double medisc = this.ui.getDouble("输入优惠额度");
		this.v.println(this.service.upMember(melevel,medisc));
	}

	//补卡功能
     private void buCard() {
    	 
		
	}

	//删除员工信息
     private String  deleteEmployee() {
		int empid = this.ui.getInt("输入员工id");
		List<employee> emp = this.service.findEmp(empid);
		if(emp==null){
			return "员工不存在";
		}
		System.out.println("员工存在");
		String s = this.ui.getString("确定删除嘛？y/n");
		if("y".equals(s)){
			return this.service.delEmployee(empid);
		}else if("n".equals(s)){
			return "取消删除";
		}
		return null;
	}

	//查看所有员工的信息
     private void selectAllemployee() {
    	 this.v.println(">>员工信息如下：");
		this.v.showArray(this.service.selectAllemployee());
		
	}

	//修改员工信息
     private String  alterEmployee() {
		int id = this.ui.getInt("输入要修改的员工的id编号");
		  List<employee> emp = this.service.findEmp(id);
		if(emp==null){
			return "员工不存在";
		}else if(emp!=null){
			System.out.println("员工信息如下");
			System.out.println(emp);
		}
		String empName = this.ui.getString("修改员工的姓名为：");
		String password = this.ui.getString("修改员工的密码为：");
		return this.service.upEmployee(id,empName,password);
	}

	//经理对普通员工的添加
     private String  addEmployee() {
		int empid = this.ui.getInt("输入员工编号：");
		String name = this.ui.getString("输入员工姓名：");
		String password = this.ui.getString("录入员工密码");
		return this.service.insertEmployee(empid,name,password);
	}
     //打印小票
     private void printTicket() {
    	 
    	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //设置日期格式
    	 // new Date()为获取当前系统时间
		System.out.println("******亚惠餐厅小票******");
		System.out.println("开单时间:"+ df.format(new Date())+"\t操作员：");
		System.out.println("----------------------");
		System.out.println("菜品名称\t数量*单价\t总价");
		
		
	}

	//点餐加入购物车方法
     int o=0;
     int q=0;
     String  w=null;
     double r=0;
     int t=0;
     int y=0;
     private String orderFood() {
    	  o = this.ui.getInt("输入客户编号");
    	  q = this.ui.getInt("输入菜品编号");
    	  w = this.ui.getString("输入菜品名称");
    	  r = this.ui.getDouble("输入菜品单价");
    	  t = this.ui.getInt("输入菜品单价");
    	  y = this.ui.getInt("输入员工编号");
    	 return null;
	}

	//会员卡挂失
     private String  deleteCard() {
		int cid = this.ui.getInt("请输入挂失客户的id");
		int eid= this.ui.getInt("请输入员工id");
		
		return this.service.upCustomerByE(cid,eid);
	}

	//卡充值
     private String  congZhi() {
		this.v.println(">>饭卡充值：");
		int id = this.ui.getInt("输入客户id");
		double money = this.ui.getDouble("输入充值金额");
		return this.service.upMoney(money,id );
	}

	//开卡方法
	private String  addCard() {
		this.v.println(">>开卡录入信息");
		this.v.println(">>请输入客户信息：");
		int id = this.ui.getInt("输入客户id：");
		//调用service方法查看客户是否存在
		List<custumer> cus = this.service.findCustumerByE(id);
		if(cus!=null){
			return "该用户已存在";
		}
		String name= this.ui.getString("输入用户姓名：");
		String password = this.ui.getString("请设置您的密码：");
		int grade= this.ui.getInt("会员等级是：");
		int  state= this.ui.getInt("会员状态是：");
		double money = this.ui.getDouble("存入的金额是：");
		return this.service.increaseCustomer(id, name, password, grade, state, money);
	}
	
}









