package oop7;

import oop7.sub.Modifier;

public class ModifierChild extends Modifier {

	public void test() {
		// ModifierChild는 Modifier과 다른 패키지에 있지만
		// 부모-자식 관계에 있기 때문에 protected, public 접근제한이 정의된 멤버에만 접근 가능
		c = 10;
		d = 10;
	}
	
}
