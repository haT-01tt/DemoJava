package Ver1;

public class PersonMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.price = 200;
        double pri = 100.00;

        PersonMain personMain = new PersonMain();

        personMain.updatePrice(product, pri);
        System.out.println(product.price + ":" + pri);
//        System.out.println(updatePrice1(pri));;

    }
    private void updatePrice(Product product, double price){
        price = price * 2;
        product.price = product.price + price;
    }
//    private static Double updatePrice1(Double price){
//        return price * 2;
//    }
    public static class Product{
        double price;
    }
}

