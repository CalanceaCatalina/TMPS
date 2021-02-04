package Singleton.Enum;

public enum Cheese {
    MOZZARELLA,
    CHEDDAR,
    EDAM,
    EMMENTAL,
    PROVOLONE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
