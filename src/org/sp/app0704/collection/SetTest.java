package org.sp.app0704.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 자바의 컬렉션 프레임웍이 지원하는객체중 순서없는 집합을 표현하는 set을
 *학습한다.
 * */
public class SetTest {
	
	public static void main(String[] args) {
		Set set=new HashSet();
		
		set.add("사과");
		set.add("딸기");
		set.add("바나나");
		
		//순서없는 집합의 요소들을 순서있게 늘어뜨려준다
		Iterator<String> it=set.iterator();
		
		//Iterator에 의해 순서가 잇는 상태이므로 반복문으로 요소들을
		//꺼낼수있다
		while(it.hasNext()) {//요소가 존재하는동안만
			String s=it.next();//커서이동과 함께 해당 위치의 객체반환
			System.out.println(s);
			
		}
		//자바의 컬렉션 중 Set,Map은 순서가 없기때문에 반복문으로 직접 
		//요소들을 제어할 수는 없지만 Iterator,enumeration같은 도구들을 이용하면
		//순서있게 처리가 가능하다
		
		
	
		
	}
}
