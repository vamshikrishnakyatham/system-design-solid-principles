class A extends Coffee_shop implements Iservable{
    public String getInvoice() {
        return "some format of invoice";
    }
    public String takeAway() {
        return "Delivery at most 30 minutes";
    }
}
class B extends Coffee_shop {
    public String getInvoice() {
        return "some other format of invoice";
    }

    //Violation of LSP
//    String takeAway() throws Exception {
//        throw new Exception("We do not have takeaway service");
//    }
}
class C extends Coffee_shop {
    public String getInvoice() {
        return "some another format of invoice";
    }

    //Violation of LSP
//    String takeAway() {
//        throw new Exception('We do not have takeaway service');
//    }
}
public class Invoice_Service {
    String generateInvoice(Coffee_shop coffeeShop){
        return coffeeShop.getInvoice();
    }
}