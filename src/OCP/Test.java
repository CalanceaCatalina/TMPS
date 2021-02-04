package OCP;

public class Test {

        public static void main(String[] args) {
            IGoods iGoods = new Food(1, "chocolate", 9.9);

            String msg = String.format("Product ID: %s, Product name: %s, Product price: %s",
                    iGoods.getId(), iGoods.getName(), iGoods.getPrice());

            System.out.println(msg);
        }
}
