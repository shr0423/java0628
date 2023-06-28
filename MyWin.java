/*
 * java.awt 패킼지는 os마다 디자인이 틀려지는 문제발생
 * 따라서 디자인을 모든 OS종류와 상관없이 자바에서 지정한 디자인 테마로 고정하기위해
 *Swing이 개발되었고, javax.swing 패키지에서 지원됨 스윙은 기존의 awt객체명에
 *접두어로 J를 붙임
 *
 *주의)그렇다고 하여 awt가 완전히 사용되지 않는것은아니다.
 *예)기존의 배치관리자등은 여전히 사용된다.
 *결론)java기반으로 GUI프로그램개발시 awt+swing을 조합해서 개발
 */
package org.sp.app0628.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWin extends JFrame {
						/*is a*/
	JButton bt;//has a
	
	//부품이 존재한다면 초기화할 이유가있다.
	public MyWin() {
		bt=new JButton("난스윙버튼");
		
		//윈도우 레이아웃을 FlowLayout으로 변경
		this.setLayout(new FlowLayout());
		
		add(bt);//나(프레임)에게 버튼부착
		
		setSize(300,400);
		setVisible(true);
		//윈도우창을 닫으면 setVisible(false)가 될뿐이므로 실제 프로그램인 즉 프로세스는
		//여전히 살아있다. 따라서 프로세스마저 죽이는 방법
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new MyWin();
		
	}
	
	
}
