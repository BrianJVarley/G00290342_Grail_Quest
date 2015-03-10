package ie.gmit.computing;

public class Exit {
	private Location loc;
	private Direction direction;
	
	public Exit(Location loc, Direction direction) {
		super();
		this.loc = loc;
		this.direction = direction;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}
