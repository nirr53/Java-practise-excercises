import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;

public class xmlReader {

   public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {   

       // Get input and normalize it
	   File inputFile = new File("input.txt");     
	   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();     
	   DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	   Document doc = dBuilder.parse(inputFile);
	   doc.getDocumentElement().normalize();
         
	   // Run on all root-element kids, if the 'kid has kids' call again to the function recursively 
	   parse(doc, 0);
   }

   @SuppressWarnings("static-access")
   private static void parse(Node parentNode, int block) {
	   
	   // Check current element kids number     
	   NodeList nList = parentNode.getChildNodes();
	   block++;
    
	   // if the kids number is zero, return
	   int nodesNum = nList.getLength();  
	   if (nodesNum == 0) {
    	
		   return;
	   }
    
	   // Loop on all kids and print their name 
	   for (int temp = 0; temp < nodesNum; temp++) {
    
		   Node nNode = nList.item(temp);
		   if (nNode.getNodeType() == nNode.ELEMENT_NODE) {

			   System.out.println(getBlocks(block) + "Current Element :" + nNode.getNodeName());
			   parse(nNode, block);
		   }
	   }
   }

   // Just add tab for prints depend on level
   private static String getBlocks(int block) {
	   	
	   String temp = "";
	   for (int j = 0 ; j < block; ++j) {
		   
		   temp += "\t";
	   }
	   return temp;
   }
}