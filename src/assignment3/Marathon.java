package assignment3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Marathon {
	
	List<Runner> runners = new ArrayList<Runner>();
	
	/* @param string list of names and corresponding int list of times
	 * creates list of runner objects: name and time score for race
	 * sorts list by time from shortest to longest
	 */ 
	public Marathon(String[] names, int[] times){
		for (int i = 0; i < names.length; i++){
			runners.add(new Runner(names[i], times[i]));
		}
		
		Collections.sort(runners);
		
		for (Runner person : runners){
			System.out.println(person.getName() + " : " + person.getTime());
		}
		
	}
	
	/* @param int place in race
	 * @return runner who placed nth
	 */
	public Runner getNthPlace(int place){
		return runners.get(place - 1);
	}
	
	public static void main(String[] args){
		
		String[] names = {"Elena","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
		int[] times = {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
	
		Marathon marathon = new Marathon(names, times);
		
		Runner secondPlace = marathon.getNthPlace(2);
		System.out.println(secondPlace.getName());
	}
	
	
	
}
