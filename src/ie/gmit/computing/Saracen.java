package ie.gmit.computing;

public class Saracen extends AbstractGameCharacter{
	private float lifeForce = 100.00f;
	
	
	//Once a run() returns, the thread dies
	public void run() {
		while (lifeForce > 0.00f){
			//Do some stuff. 
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(this.getName() + " has just died...");
	}

}
