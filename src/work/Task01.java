package work;

public class Task01 {

	public static void main(String[] args) {
//		// 1����д����������Ǯ��ټ������⡣������Ǯһֻ��ĸ����Ǯһֻ��С��
//		һǮ��ֻ�����а�Ǯ����ټ������ж������򷨣�
				int a=0;
				int b=0;
				int c=0;
				int s=0;
				
				for(int i=0;i<100/5;i++){
					//���򹫼�������		
					for(int j=0;j<=100/3;j++){
						//����ĸ��������			
						for(int k=0;k<=100;k++){
							//����С��������	
							if(100==i*5+j*3+k){
								s=s+1;
								System.out.println("����"+s+"�����򹫼�"+i+"ֻ��ĸ��"+j+"ֻ��С��"+k+"ֻ");
							}
						}	
					}				
				}		
			}
		

		

	}


