package prg.run.xml;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
//import org.apache.xml.serializer.x
import java.util.List;

import core.exolab.cst.xml.*;
import prg.source.*;

public class MarshUnmarshToXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
	    	DocumentTtnWaybill sessions = new DocumentTtnWaybill("9270210/NN", "2018-05-17T00:00:00", "100640538", "Belbohemia", "192981385", "Posudaland");
	        sessions.addItem("GTIN 4814554115853, art J8874, cod 115853");
	    	sessions.addItem("GTIN 4814554115860, art J8876, cod 115860");
	   
	        FileWriter writer = new FileWriter("data\\out\\waybill.xml");
	        Marshaller.marshal(sessions, writer);
	        writer.close();
	      } catch (Exception e) {
	        System.err.println(e.getMessage());
	        e.printStackTrace(System.err);
	      }
	    
	    try {
	        FileReader reader = new FileReader("data\\out\\waybill.xml");
	    	DocumentTtnWaybill document = (DocumentTtnWaybill)Unmarshaller.unmarshal(DocumentTtnWaybill.class, reader);
        	        
	        System.out.println("Document Number: " + document.getNumber());
	        System.out.println("Document Date: 	 " + document.getDate());
	        System.out.println("SupplierUNP:	 " + document.getSupplierUNP());
	        System.out.println("Supplier:	 " + document.getSupplier());
	        System.out.println("BuyerUNP:	 " + document.getBuyerUNP());
	        System.out.println("Buyer:		 " + document.getBuyer());
	        
	        List items = document.getItems();
	        if (items == null) {
	          System.out.println("Document empty");
	        } else {
	          for (Iterator i = items.iterator(); i.hasNext(); ) {
	            System.out.println("Item: " + i.next());
	          }
	        }
	      } catch (Exception e) {
	        System.err.println(e.getMessage());
	        e.printStackTrace(System.err);
	      }
	}	
}
