import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//dddddddddddddddddddddddddddddddddd
class Card
{
	static int epic=0;
	static int sss=0;
	static int ss=0;
	static int s=0;
	
	void Epic_Plus()
	{
		epic++;
	}
	void Sss_Plus()
	{
		sss++;
	}
	void Ss_Plus()
	{
		ss++;
	}
	void s_Plus()
	{
		s++;
	}
}

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c=new Card();
		
		//Integer�� ����Ʈ ����
		List<Integer> list=new ArrayList<Integer>();
		//0���� 9999���ڱ��� ����Ʈ�� �־���
		for(int i=0;i<1000;i++)
			list.add(i);
		//����Ʈ ���� ����
		Collections.shuffle(list);
		//������ ���� �� ���õ� ���� ����Ʈ�� ����(0���� 10����)
		List<Integer> picked=list.subList(0, 10);
		//���ڸ���Ʈ �������� ����
		Collections.sort(picked);
		
//		//��ü ���
//		for(int ini:list)
//			System.out.println(ini);
		
		//subList�� �ش�Ǵ� ���� ���
		for(int i=0;i<picked.size();i++)
		{	//System.out.println(picked.get(i));
			if(picked.get(i)==0)
			{
				c.Epic_Plus();
			}
			else if(picked.get(i)>=1 && picked.get(i)<=50)
			{
				c.Sss_Plus();
			}
			else if(picked.get(i)>=51 && picked.get(i)<=350)
			{
				c.Ss_Plus();
			}
			else
			{
				c.s_Plus();
			}
		}	
		
		System.out.println("----ī�� ����----\n");
		System.out.println("���� ī��:"+Card.epic+"��");
		System.out.println("������ ī��:"+Card.sss+"��");
		System.out.println("���� ī��:"+Card.ss+"��");
		System.out.println("�� ī��:"+Card.s+"��");
	}
}

