package oop3;
/**
 * 11
 * @author HYB
 *
 */
public class PhoneDemo3 {
	public static void main(String[] args) {
		
		Phone p = new Iphone8();
		
		System.out.println("Phone --> " + (p instanceof Phone));
		System.out.println("FeaturePhone --> " + (p instanceof FeaturePhone));
		System.out.println("SmartPhone --> " + (p instanceof SmartPhone));
		System.out.println("IPhone --> " + (p instanceof Iphone));
		System.out.println("Galaxy --> " + (p instanceof Galaxy));
		System.out.println("IPhone8 --> " + (p instanceof Iphone8));
		System.out.println("IPhoneX --> " + (p instanceof IphoneX));
		System.out.println("IPhone11 --> " + (p instanceof Iphone11));
		
	}
}
