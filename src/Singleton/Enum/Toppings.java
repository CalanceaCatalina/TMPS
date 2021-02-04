package Singleton.Enum;

public enum Toppings {

    BACON("bacon"),
    BASIL("basil"),
    BLACK_OLIVES("black olives"),
    CHEESE("cheese"),
    CHERRY_TOMATO("cherry tomato"),
    CHILI_PEPPER("chili pepper"),
    GREEN_OLIVES("green olives"),
    HOT_SAUCE("hot sauce"),
    MOZZARELLA("mozzarella"),
    MUSHROOM("mushroom"),
    OREGANO("oregano"),
    PARMESAN("parmesan"),
    PARSLEY("parsley"),
    SHRIMP("shrimp"),
    TOMATO("tomato"),
    TUNA("tuna"),
    ZUCCHINI("zucchini");

    private String toppings;

    Toppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return toppings;
    }
}
