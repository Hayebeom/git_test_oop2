package oop9;

public class HDMonitor extends AbstractMonitor {
	
	String resolution;
	
	public HDMonitor(String resolution) {
		this.resolution = resolution;
	}
	
	@Override
	public void display() {
		if (!getPower()) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		
		System.out.println("[" + resolution + "] 급 화질로 동영상을 재생합니다.");
		
	}
}
