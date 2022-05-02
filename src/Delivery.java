class Delivery {
    private Customer customer;
    private Coffee_shop coffeeShop;
    private IOrderCustomer orderCustomer;
    private IOrderCoffeeShop orderCoffeeShop;
    //Violation of DIP
//    Delivery(Customer customer, Coffee_shop coffeeShop) {
//        this.customer = customer;
//        this.coffeeShop = coffeeShop;
//    }
//    void deliver(){
//        customer.makePayment();
//        coffeeShop.getPayment();
//        coffeeShop.deliverCoffee();
//        customer.receiveCoffee();
//    }
    Delivery(IOrderCoffeeShop orderCoffeeShop,IOrderCustomer orderCustomer) {
        this.orderCoffeeShop = orderCoffeeShop;
        this.orderCustomer = orderCustomer;

    }
        void deliver() {
            orderCustomer.createOrder();
            orderCoffeeShop.deliverOrder();
            orderCustomer.receiveOrder();
        }
}