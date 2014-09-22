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
		
		//Integer형 리스트 생성
		List<Integer> list=new ArrayList<Integer>();
		//0에서 9999숫자까지 리스트에 넣어줌
		for(int i=0;i<1000;i++)
			list.add(i);
		//리스트 셔플 돌림
		Collections.shuffle(list);
		//지정된 범위 내 선택된 숫자 리스트에 넣음(0포함 10제외)
		List<Integer> picked=list.subList(0, 10);
		//숫자리스트 오름차순 정리
		Collections.sort(picked);
		
//		//전체 출력
//		for(int ini:list)
//			System.out.println(ini);
		
		//subList에 해당되는 내용 출력
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
		
		System.out.println("----카드 총합----\n");
		System.out.println("에픽 카드:"+Card.epic+"개");
		System.out.println("스스스 카드:"+Card.sss+"개");
		System.out.println("스스 카드:"+Card.ss+"개");
		System.out.println("스 카드:"+Card.s+"개");
	}
}

