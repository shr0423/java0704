package org.sp.app0704.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;

/*
 * 자바의 컬렉션 프레임웍의 객체중 key-valueㅓ의 쌍으로 데이터를 모아서
 * 처리하는 Map 을학습한다.
 * */
public class MapTest {
	
	public static void main(String[] args) {
		Map<String,JButton> map=new HashMap<String,JButton>();
		
		map.put("b1",new JButton("버튼1"));
		map.put("b2",new JButton("버튼2"));
		map.put("b3",new JButton("버튼3"));
		
		//JButton obj=map.get("b3");
		//System.out.println(obj);
		
		//맵또한 순서가 없기때문에 모든요소를 반복문으로접근하려면
		//무언가 순서있는 객체의 도움을받아야 하는데 이미 순서없는 집합을 잘 지원해주고
		//잇는 Set을 활용해보자
		
		//맵에 들어있는 객체들을 대상으로 모두 추출하는것이 아니라
		//키만을 추출하여 set으로 담아놓ㄷ자
		Set keys=map.keySet();
		
		//Iterator도구를 활용하여 일렬로 늘어지게 하자
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {//다음요소가 존재하는 동안만
			String key=it.next();
			
			//키를 이용하여 맵에서 객체를 꺼내기
			JButton bt=map.get(key);
			System.out.println(bt.getText());
		}
		
	}
	
}
