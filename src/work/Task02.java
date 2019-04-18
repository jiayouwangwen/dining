package work;
import java.util.Scanner;
public class Task02 {

	public static void main(String[] args) {
//		// 2、企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
//		利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
//		高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，
//		可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，
//		高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
//		从键盘输入当月利润，求应发放奖金总数？
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入企业的当月利润：");
		double a=sc.nextInt();
		double b=0,c=0,d=0,e=0,f=0,g=0;
		
		if(a<=10){
			b=a*0.1;
			System.out.println("应发放奖金总数："+b+"万");
		}else if(a>10 && a<=20){
			c=10*0.1+(a-10)*0.075;
			System.out.println("应发放奖金总数："+c+"万");
		}else if(a>20 && a<=40){
			d=10*0.1+10*0.075+(a-20)*0.05;
			System.out.println("应发放奖金总数："+d+"万");
		}else if(a>40 && a<=60){
			e=10*0.1+10*0.075+20*0.05+(a-40)*0.03;
			System.out.println("应发放奖金总数："+e+"万");
		}else if(a>60 && a<=100){
			f=10*0.1+10*0.075+20*0.05+20*0.03+(a-60)*0.015;
			System.out.println("应发放奖金总数："+f+"万");
		}else if(a>100){
			g=10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(a-100)*0.01;
			System.out.println("应发放奖金总数："+g+"万");
		}else{
			System.out.println("输入有误，或企业处于亏本儿状态！");
		}
		
		

	}

}
