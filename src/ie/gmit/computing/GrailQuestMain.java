package ie.gmit.computing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GrailQuestMain {

	public static void main(String[] args) throws Exception {
	    //Get the DOM Builder Factory
	    DocumentBuilderFactory factory = 
	        DocumentBuilderFactory.newInstance();

	    //Get the DOM Builder
	    DocumentBuilder builder = factory.newDocumentBuilder();

	    //Load and Parse the XML document
	    //document contains the complete XML as a Tree.
	    Document document = 
	      builder.parse(new File("network.xml"));
	    
	    NodeList locationName = document.getElementsByTagName("location name");
	    NodeList locationDescription = document.getElementsByTagName("location description");
	   
	    
	}

	   
}
