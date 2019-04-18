package work;

public class Task04 {

	public static void main(String[] args) {
		// 4、一球从100米高度自由落下，每次落地后反跳回原高度的一半；
		//再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？ 
		
			int m=100;
			int s=0;
			for(int i=1;i<=10;i++){
				s=s+m+m/2;
				m=m/2;
			}
			System.out.println("第十次落地时共经过"+s+"米");
			System.out.println("第十次反弹高度为"+m);
		}

	}

		


	


