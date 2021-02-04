package Singleton.Enum;

public enum Magic {

    SOUL,
    STARDUST,
    LOVE,
    JOY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
