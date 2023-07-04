package org.sp.app0704.collection;

import java.util.ArrayList;

/*
 * java의 컬렉션 프레임웍중 List를 학습해본다.
 * List느 순서가 있는 객체의 모임을 표현하며, 우 리가 기존에 알고 있었던 배열과
 *거의 같다. 단지 차이가 잇다면 
 *1)크기가동적으로 변할수있다.
 *2)배열은 int[], byte[],short[]..등 모든 자료형마다 지원되지만
 *컬렉션 프레임웍은 그 대상이 오직 객체만 다루므로 List에 들어올수잇는데이터는
 *오직 객체형 데이터만 가능하다
 *
 */
public class ListTest {
	
	public static void main(String[] args) {
		//ArrayList은 list인터페이스의 자식
		ArrayList list=new ArrayList();
		
		list.add("사과");
		list.add("딸기");
		list.add("오렌지");
		System.out.println("현재까지 체워진과일수는"+list.size());
	}
}
