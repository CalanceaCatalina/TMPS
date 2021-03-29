package Prototype_AbstractFactory.Boxes;
import Prototype_AbstractFactory.Boxes.Abstracts.Pizza_Box;

public class Box_Type_Large extends Pizza_Box {

    public Box_Type_Large(){
        address = this.getAddress();
        ID = this.setID_order();
    }

    public Box_Type_Large(String Address, int id){
        address = Address;
        ID = id;
    }

    @Override
    public void FinishBoxing(String address, String Name) {
        System.out.println("Pizzeria " + setLogo() + " Thanks you for the order! :) ");
        System.out.println("Order ID: " + ID);
        System.out.println(address);
        System.out.println("Pizza " + Name + " was packed in a Large sized box. \n");
    }

    @Override
    public Pizza_Box Clone() {
        Box_Type_Large box = new Box_Type_Large(this.address, this.ID);
        return box;
    }
}
