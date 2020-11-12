package WeekTwo.OOP.Abstraction;

public class PrinterShop {
  
  /*
    Offer diff kind of printer
	  1. print color
	  2. print in B/W
	  3. Scan
	  4. Wifi
	  5. Fax
	  
	  order. 1. color, scan and fax
	  order. 2. B/W, wifi
	  
   */
  
  public static void main(String[] args) {
    PrinterOne one = new PrinterOne();
    one.canFax();
    one.canPrintColor();
    one.canScan();
    
    
  }
}


interface ColorPrinter {
  public abstract void canPrintColor();
}

interface BWPrinter {
  public abstract void canPrintBW();
}

interface Scan {
  public abstract void canScan();
}

interface Wifi {
  public abstract void canWifi();
}

interface Fax {
  public abstract void canFax();
}


class PrinterOne implements ColorPrinter,Scan, Fax{
  
  @Override
  public void canPrintColor() {
  
  }
  
  @Override
  public void canScan() {
  
  }
  
  @Override
  public void canFax() {
  
  }
}

class PrinterTwo implements BWPrinter, Wifi{
  
  @Override
  public void canPrintBW() {
  
  }
  
  @Override
  public void canWifi() {
  
  }
}



