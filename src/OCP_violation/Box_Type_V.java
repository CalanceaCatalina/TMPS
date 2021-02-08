package OCP_violation;

import Singleton.Enum.Size;

import static Singleton.Enum.Size.*;

public class Box_Type_V {
    public static void Boxing_V(Size type) {
        switch (type) {
            case FAMILY:
                Family_V_Boxing family_v_boxing = new Family_V_Boxing();
                family_v_boxing.Boxing_V();
                break;
            case ITALIAN:
                Italian_V_Boxing italian_v_boxing = new Italian_V_Boxing();
                italian_v_boxing.Boxing_V();
                break;
            case LARGE:
                Large_V_Boxing large_v_boxing = new Large_V_Boxing();
                large_v_boxing.Boxing_V();
                break;
            case MEDIUM:
                Medium_V_Boxing medium_v_boxing = new Medium_V_Boxing();
                medium_v_boxing.Boxing_V();
                break;
            default:
                System.out.println("ERROR unknown size type");
                break;
        }
    }
}