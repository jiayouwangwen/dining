package work;

public class Task04 {

	public static void main(String[] args) {
		// 4��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
		//�����£������� ��10�����ʱ�������������ף���10�η�����ߣ� 
		
			int m=100;
			int s=0;
			for(int i=1;i<=10;i++){
				s=s+m+m/2;
				m=m/2;
			}
			System.out.println("��ʮ�����ʱ������"+s+"��");
			System.out.println("��ʮ�η����߶�Ϊ"+m);
		}

	}

		


	


