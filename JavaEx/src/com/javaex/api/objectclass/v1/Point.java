package com.javaex.api.objectclass.v1;

// 트별히 상속받지 않아도 java.lang.Object를 상속 받는다.
// java.lang.Object -> 자바 객체의 최상위 클래스
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 객체의 정보를 문자열로 변환
	// print 계열의 메서드로 출력할 때
	// 문자열과 객체를 연결할 때 호출
	@Override
	public String toString() {
		return String.format("Point(%,d, %d)", x,y);
	}

}