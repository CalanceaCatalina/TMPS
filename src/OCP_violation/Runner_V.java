package OCP_violation;

import Singleton.Enum.Size;

public class Runner_V {
    public static void main(String[] args) {
        Box_Type_V.Boxing_V(Size.FAMILY);
        Box_Type_V.Boxing_V(Size.ITALIAN);
        Box_Type_V.Boxing_V(Size.MEDIUM);
        Box_Type_V.Boxing_V(Size.LARGE);
    }
}
