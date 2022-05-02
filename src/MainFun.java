public class MainFun {
    public static void main(String [] args) {
        Address add = new Address("Hyderabad",500035);
        Coffee_shop cshp = new Coffee_shop("Zemoso's Coffee Hub",add);
        A aa = new A();
        Invoice_Service invoice_service = new Invoice_Service();
        System.out.println(invoice_service.generateInvoice(aa));

    }
}
