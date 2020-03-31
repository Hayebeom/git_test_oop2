package oop1;

public class TvDemo {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.power();							// Tv
		tv.channelUp();						// Tv
		tv.channelDown();					// Tv
		
		CaptionTv captionTv = new CaptionTv();
		captionTv.power();					// Tv
		captionTv.channelUp();				// Tv
		captionTv.channelDown();			// Tv
		
		captionTv.caption = true;			// captionTv
		captionTv.displayCaption("시각장애우를 위한 자막을 표시합니다."); // captionTv
		
		IPTv iptv = new IPTv();
		iptv.power();						// Tv
		iptv.channelUp();					// Tv
		iptv.channelDown();					// Tv
		
		iptv.ip = "211.167.24.123";	// IPTv
		iptv.internet("www.daum.net"); 		// IPTv
		
		NetflixTv netfilxTv = new NetflixTv();
		netfilxTv.power();					// Tv
		netfilxTv.channelUp();				// Tv
		netfilxTv.channelDown();			// Tv
		netfilxTv.ip = "211.167.24.123";	// IPTv
		netfilxTv.internet("www.daum.net");	// IPTv
		
		netfilxTv.membership = "standard";	// netfilxTv
		netfilxTv.watchMovie("더블타겟");		// netfilxTv
		
	}
}
