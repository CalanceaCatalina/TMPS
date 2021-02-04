package Singleton.Enum;

import java.util.Locale;

public enum Dough {

    PIZZA_DOUGH(" Classic dough made from Water, Flour, Oil, Salt, Sugar."),
    PIZZA_DOUGH_YEAST(" Yeast dough made from Yeast, Water, Flour, Oil, Salt, Sugar."),
    PIZZA_DOUGH_CORNMEAL(" Cornmeal dough made from Cornmeal, Water, Flour, Oil, Salt, Sugar.");

    private String dough;

    Dough(String dough) {
        this.dough = dough;
    }

    @Override
    public String toString() {
        return dough;
    }
}
