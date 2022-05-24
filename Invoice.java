package Lab2;

public class Invoice {
    public void display (int partnumber, String description, double price) {
        System.out.println("Part number: "+partnumber);
        System.out.println("Description: "+description);
        System.out.println("Price: Tsh."+price);
    }

    public static void main(String[] args) {
        Invoice invoice1=new Invoice();
        Invoice invoice2= new Invoice();
        Invoice invoice3=new Invoice();

        System.out.println("Invoice 1");
        invoice1.display(5,"Snickers",7500);
        invoice1.display(10,"Dairy Milk", 25000);
        invoice1.display(10,"Hide&Seek",15000);
        System.out.println("\nInvoice 2");
        invoice2.display(1,"toyota Alphard",20000000);
        invoice2.display(1,"Range Rover",200000000);
        System.out.println("\nInvoice 3");
        invoice3.display(1,"speaker",20000);
        invoice3.display(1,"1Tb Hard drive",100000);
        invoice3.display(2,"External case",20000);

    }
}
