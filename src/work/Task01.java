package work;

public class Task01 {

	public static void main(String[] args) {
//		// 1、编写程序解决“百钱买百鸡”问题。公鸡五钱一只，母鸡三钱一只，小鸡
//		一钱三只，现有百钱欲买百鸡，共有多少种买法？
				int a=0;
				int b=0;
				int c=0;
				int s=0;
				
				for(int i=0;i<100/5;i++){
					//购买公鸡的数量		
					for(int j=0;j<=100/3;j++){
						//购买母鸡的数量			
						for(int k=0;k<=100;k++){
							//购买小鸡的数量	
							if(100==i*5+j*3+k){
								s=s+1;
								System.out.println("方法"+s+"：购买公鸡"+i+"只，母鸡"+j+"只，小鸡"+k+"只");
							}
						}	
					}				
				}		
			}
		

		

	}


