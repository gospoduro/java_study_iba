package prg.run.xml;
 
import java.io.FileWriter;

import core.exolab.cst.xml.Marshaller;
import prg.source.*;
 
public class MarshalToXml {
 
  public static void main(String[] args) {
    try {
    	DocumentTtnWaybill sessions = new DocumentTtnWaybill("9270209/NN", "2018-05-17T00:00:00", "100640538", "Belbohemia", "192981385", "Posudaland");
    	sessions.addItem("Item 1 fullName");
    	sessions.addItem("Item 2 fullName");
 
      FileWriter writer = new FileWriter("data\\out\\waybill.xml");
      Marshaller.marshal(sessions, writer);
    } catch (Exception e) {
      System.err.println(e.getMessage());
      e.printStackTrace(System.err);
    }
  }
}