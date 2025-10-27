package sec01.exam06;

import sec01.exam04.RemoteControl;
import sec01.exam04.Audio;
import sec01.exam04.Television;

public class MyClass {
	
	RemoteControl rc = new Television();
	// 필드
	MyClass(){
	}
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(6);
	}
}
