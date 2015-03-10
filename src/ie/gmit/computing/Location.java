package ie.gmit.computing;

import java.util.*;

public class Location implements Lookable{
	private List<AbstractGameCharacter> observers = new ArrayList<AbstractGameCharacter>();
	private List<Thing> objects = new ArrayList<Thing>();
	private List<Exit> exits = new ArrayList<Exit>();
	private String name;
	private String description;
	
	public void enter(AbstractGameCharacter gc){
		observers.add(gc);
	}
	
	public void exit(GameChacter gc){
		observers.remove(gc);
	}
	
	
	public void look() {
		StringBuffer sb = new StringBuffer();
		sb.append("-------- " + this.name + " -----------\n");
		sb.append(this.description);
		
		sb.append("\nYou see: \n");
		for (GameChacter gc : observers){
			sb.append(gc.getName());
		}
		
		//You also see objects....
		
		sb.append("\nVisible exits are: \n");
		for (Exit e : exits){
			sb.append(e.getDirection());
		}		
	}
	
	
	
	
	
	

	
	
}
