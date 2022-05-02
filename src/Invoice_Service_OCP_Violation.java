public class Invoice_Service_OCP_Violation {

    public String generateInvoice(Coffee_shop coffee){
        String invoice = "";
        if(coffee.getClass() == A.class){
            invoice = "some format of invoice";
        }
        if(coffee.getClass() == B.class){
            invoice = "some other format of invoice";
        }
        if(coffee.getClass() == C.class){
            invoice = "some another format of invoice";
        }
        return invoice;
    }
}