package thread;

import java.util.Random;

public class Line extends Thread {
	public static int resource = 0;
	public String name;
	public int time;
	public boolean mute = false;
	
	public Line(String name) {
		this.name = name;
		this.time = ((int)(Math.random()*300)+300);
		System.out.println(name + ":" + time + "second");
	}
	
	public void run() {
		
		try {
			for(int i=0; i< 10; i++) {
				System.out.println("catch " + name + ":" + resource);
				sleep(time);
				while(mute) {
				}
				mute = true;
				int temp = resource;
				sleep(time);
				resource = temp + 1;
				System.out.println("save " + name + ":" + resource);
				mute = false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
