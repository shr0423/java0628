package org.sp.app0628.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

public class Test1 {
	public static void main(String[] args) {
		Frame f=new Frame();//윈도우생성
		f.setSize(500,400);
		
		f.setLayout(new BorderLayout());//프레임에 보더 레이아웃 적용
		
		//패널은 현실의 판자를 표현한 것이며 색상이없다.
		Panel[] p=new Panel[5];
		for(int i=0;i<p.length;i++) {
			p[i]=new Panel();//배열의 각 요소에 패널을 생성하여 대입
			
		}
		
		p[0].setBackground(Color.RED);
		p[1].setBackground(Color.YELLOW);
		p[2].setBackground(Color.BLUE);
		p[3].setBackground(Color.GREEN);
		p[4].setBackground(Color.PINK);
			
		
		p[0].setPreferredSize(new Dimension(500,100));		
		p[1].setPreferredSize(new Dimension(500,100));		
		p[2].setPreferredSize(new Dimension(100,200));		
		p[3].setPreferredSize(new Dimension(300,200));		
		p[4].setPreferredSize(new Dimension(100,200));		
		
		f.add(p[0],BorderLayout.NORTH);//북쪽에 패널 0번째 부착
		f.add(p[1],BorderLayout.SOUTH);//남쪽에 패널 1번째 부착
		f.add(p[2],BorderLayout.WEST);//서쪽에 패널 2번째 부착
		//f.add(p[3],BorderLayout.CENTER);//센터에 패널 3번째 부착
		f.add(p[4],BorderLayout.EAST);//동쪽에 패널 4번째 부착
		
		//버튼2개생성하여 남쪽의 패널에 부착하기
		Button bt1=new Button("Login");
		Button bt2=new Button("Regist");
		
		//자바 GUI 의 컴포넌트 중 해당 객체가 Container일 경우 다른 컴포넌트들을
		//포함할 능력이 있게된다. 또한다른컴포넌트를 포함할때는 반드시 어떤방식으로
		//컴포넌트들을 배치할지를 결정해야 하며 이때사용되는 객체가 바로 배치관리자
		//(FlowLayout,GridLayout,BorderLayout)이다.
		//Frame,Panel이건 즉 Container형인 경우만일 개발자가 배치를 명시하지 않으면
		//배치가 적용되지 않는것이 아니라, 디폴트로 배치가 자바 언어에서 미리 정해놓은 
		//배치관리자가 적용되는데,
		//Frame-디폴트 BorderLayout
		//panel-FlowLayout
		
		//p[1].add(bt1);//남쪽 패널에 버튼 추가
		//p[1].add(bt2);//남쪽 패널에 버튼 추가
		
		//센터영역에 버튼 추가
		f.add(bt1,BorderLayout.CENTER);//센터영역에 버튼 추가
					
		f.setVisible(true);
		 
	}
}
