package org.sp.app0704.collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class ListTest2 {
	public static void main(String[] args) {
		
		//커렉션 사용시 Generic타입을 명시하면 불순물을방지할수있고
		//더욱이 꺼낼때 형변환 과정을 거치지않아도 된느 편리함이있따
		List<JButton> list=new ArrayList<JButton>( );
		
		list.add(new JButton("나버튼1"));
		list.add(new JButton("나버튼2"));
		list.add(new JButton("나버튼3"));
		
		JButton obj=list.get(0);
		
		
	}
}
