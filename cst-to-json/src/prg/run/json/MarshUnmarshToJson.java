package prg.run.json;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import core.cst.json.*;
import prg.source.*;

public class MarshUnmarshToJson {

	public static void main(String[] args) {
		
	    try {
	    	DocumentTtnWaybill sessions = new DocumentTtnWaybill("9270210/NN", "2018-05-17T00:00:00", "100640538", "Belbohemia", "192981385", "Posudaland");
	        sessions.addItem("GTIN 4814554115853, art J8874, cod 115853");
	    	sessions.addItem("GTIN 4814554115860, art J8876, cod 115860");
	   
	        Writer writer = new FileWriter("data\\out\\waybill.json");
	        MarshallerToJson.marshal(sessions, writer);
	        writer.close();
	      }catch (Exception e) {
	    	  
	    	  System.err.println(e.getMessage());
	    	  
	    	  e.printStackTrace(System.err);
	      }
	    
	    try {
	    	Reader reader = new FileReader("data\\out\\waybill.json");
	    	DocumentTtnWaybill document = (DocumentTtnWaybill)UnmarshallerFromJson.unmarshal(DocumentTtnWaybill.class, reader);
	        
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
