package SRP;
public class Prepare_Method_Ingredients {

    //utilizam singleton ca sa ne permita sa accesam toString-ul de mai jos
    private static Prepare_Method_Ingredients instance;
    public static Prepare_Method_Ingredients getPreparationMethod() {
        if (instance == null) {
            instance = new Prepare_Method_Ingredients();
        }
        return instance;
    }

    public String getMethod(Prepare prepare) {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a typical pizza of size ")
                .append(prepare.size)
                .append(" with")
                .append(prepare.dough)
                .append("\n");

        if (prepare.crust != null) {
            sb.append(" surrounded by ")
                    .append(prepare.crust)
                    .append(" crust. ")
                    .append("\n");
        }

        if (prepare.cheese != null) {
            sb.append("With softly and yummy ");
            for (int i = 0; i<prepare.cheese.size(); i++) {
                sb.append(prepare.cheese.get(i));
                if (i < prepare.cheese.size() - 1){
                    sb.append(", ");
                }
            }
            sb.append(" cheese. \n");


        }

        if (prepare.toppings != null) {
            sb.append("In addition it has the following specialities on top: ");
            for (int i = 0; i<prepare.toppings.size(); i++) {
                sb.append(prepare.toppings.get(i));
                if (i < prepare.toppings.size() - 1){
                    sb.append(", ");
                }
            }
            sb.append(". \n");
        }

        if (prepare.magic != null) {
            sb.append("And lastly, of course, it is made with lots of ");
            for (int i = 0; i<prepare.magic.size(); i++) {
                sb.append(prepare.magic.get(i));
                if (i < prepare.magic.size() - 1){
                    sb.append(", ");
                }
            }
            sb.append(". \n");
        }

        return sb.toString();
    }
}
