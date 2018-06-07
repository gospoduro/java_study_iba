package prg.run.xml;
 
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import core.exolab.cst.xml.Unmarshaller;
import prg.source.*;
 
public class UnmarshalToXml {
 
  public static void main(String[] args) {
    try {
      FileReader reader = new FileReader("data\\out\\waybill.xml");
      DocumentTtnWaybill document = (DocumentTtnWaybill)Unmarshaller.unmarshal(DocumentTtnWaybill.class, reader);
      
      System.out.println("Document Number: " + document.getNumber());
      System.out.println("Document Supplier: " + document.getSupplier());
      
      System.out.println("Document Number:  " + document.getNumber());
      System.out.println("Document Date:	" + document.getDate());
      System.out.println("SupplierUNP:		" + document.getSupplierUNP());
      System.out.println("Supplier:			" + document.getSupplier());
      System.out.println("BuyerUNP:			" + document.getBuyerUNP());
      System.out.println("Buyer:			" + document.getBuyer());
      
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