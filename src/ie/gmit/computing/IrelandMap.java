package ie.gmit.computing;

public class IrelandMap {
	private Node galway;
	
	public IrelandMap() {
		galway = new Node("Galway", 200);
		Node limerick = new Node("Limerick", 170);
		Node belfast = new Node("Belfast", 270);
		Node cork = new Node("Cork", 120);
		Node dublin = new Node("Dublin", 130);
		Node waterford = new Node("Waterford", 0);	
        Node cashel = new Node("Cashel", 0);
        Node kilkenny = new Node("Kilkenny", 0);			
		waterford.setGoalNode(true);
		
		
		galway.addChildNode(limerick, 105);
		galway.addChildNode(belfast, 306);
		
		limerick.addChildNode(galway, 105);
		limerick.addChildNode(belfast, 323);
		limerick.addChildNode(cork, 121);
		limerick.addChildNode(cashel, 121);
		
		cork.addChildNode(dublin, 220);
		cork.addChildNode(waterford, 126);
		cork.addChildNode(limerick, 121);	
		
		waterford.addChildNode(cork, 126);
		waterford.addChildNode(dublin, 158);	
		
		dublin.addChildNode(belfast, 167);
		dublin.addChildNode(waterford, 158);
		dublin.addChildNode(cork, 220);	
		
		belfast.addChildNode(dublin, 167);
		belfast.addChildNode(galway, 306);
		belfast.addChildNode(limerick, 323);	
	}
	
	public Node getStartNode(){
		return galway;
	}
}
