public class Coffee_shop implements IOrderCoffeeShop{
    String name;
    Address address;
    Coffee_shop() {

    }
    Coffee_shop(String name, Address address){
        this.name = name;
        this.address = address;
    }
    void getName() {
        System.out.println("This actually gives the name " + name);
    }
    void getAddress() {
        System.out.println("This actually gives the address city " + address.city);
    }
//    String getInvoice() {
//        return "local invoice";
//    }
    //getInvoice();
    //abstract String takeAway();
//    void getPayment() {
//
//    }
//    void deliverCoffee() {
//
//    }
    public void deliverOrder() {
        getPayment();
        deliverCoffee();
    }
    void getPayment() {
    }
    void deliverCoffee() {
    }

    public String getInvoice() {
        return "This is the basic Invoice";
    }
}
class Address {
    String city;
    int zipcode;
    Address(String city, int zipcode){
        this.city = city;
        this.zipcode = zipcode;
    }
}
class AddressService{
    public void changeAddress(String city, int zipcode) {
        Address newAddress = new Address(city,zipcode);
        System.out.println("New address city is : "+ newAddress.city);
    }
}