package Prototype_AbstractFactory.Boxes.Abstracts;
import java.util.Random;

public abstract class Pizza_Box {

    public String address;
    public int ID;

    public int setID_order() {
        Random rand = new Random(); //instance of random class
        int maxRange = 2000;
        int int_random = rand.nextInt(maxRange);
        return int_random;
    }

    public String setLogo() {
        return "\"Diablo\"";
    }

    public void setAddress(String street, int number, int floor, int apartment) {
        this.address = "Your order will be delivered at address: " + street + " nr. " + number + " floor: "
                + floor + " apartment number: "+ apartment ;
    }

    public String getAddress(){
        return this.address;
    }

    public abstract void FinishBoxing(String address, String Name);
    public abstract Pizza_Box Clone();
}
