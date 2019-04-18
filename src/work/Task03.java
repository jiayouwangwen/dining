package work;

public class Task03 {

	public static void main(String[] args) {
//		3、猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩
//		下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下 
//		的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
		int a=1;
		for(int i=10;i>1;i--){
			a=2*a+2;
		}
		System.out.println("第一天共摘了"+a);


	}

}
