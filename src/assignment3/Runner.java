package assignment3;

public class Runner implements Comparable<Runner>{
	
	private String name;
	private int time;
	
	public String getName(){
		return name;
	}
	
	public int getTime(){
		return time;
	}
	
	public Runner(String name, int time){
		this.name = name;
		this.time = time;
	}

	@Override
	public int compareTo(Runner runner) {
		if(this.getTime() < runner.getTime()){
			return -1;
		}
		if (this.getTime() > runner.getTime()){
			return 1;
		}
		return 0;
	}

	

	
}