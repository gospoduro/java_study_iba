package prg.source;
 
import java.util.ArrayList;
import java.util.List;
 
public class DocumentTtnWaybill implements java.io.Serializable {
 
  private String number = null;
  private String date = null;
  
  private String supplierUnp = null;
  private String supplier = null;
  
  private String buyerUnp = null;
  private String buyer = null;

  private List items = null;
 
  /** Empty constructor */
  public DocumentTtnWaybill() {
    super();
  }
 
  public DocumentTtnWaybill(String number, String date, String supplierUnp, String supplier, String buyerUnp, String buyer) {
    super();
    this.number = number;
    this.date = date;
    this.supplierUnp = supplierUnp;
    this.supplier = supplier;
    this.buyerUnp = buyerUnp;
    this.buyer = buyer;
  }
 
  public void setName(String number) {
    this.number = number;
  }
 
  public String getNumber() {
    return number;
  }
  
  public void setDate(String date) {
	this.date = date;
  }
	 
  public String getDate() {
	return date;
  }

  public void setSupplierUnp(String supplierUnp) {
	this.supplierUnp = supplierUnp;
  }
	  		  
  public String getSupplierUNP() {
	return supplierUnp;
  }   	  

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }
 
  public String getSupplier() {
    return supplier;
  }

  public void setBuyerUnp(String buyerUnp) {
	this.buyerUnp = buyerUnp;
  }
	  		  
  public String getBuyerUNP() {
	return buyerUnp;
  }   	  

  public void setBuyer(String buyer) {
    this.buyer = buyer;
  }
 
  public String getBuyer() {
    return buyer;
  }  
  
  public void setItems(List items) {
    this.items = items;
  }
 
  public List getItems() {
    return items;
  }
 
  public void addItem(String itemName) {
    if (items == null) {
      items = new ArrayList();
    }
    items.add(itemName);
  }
}