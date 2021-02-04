package Singleton.Lab1;

public class Runner {
        public static void main(String[] args){
// hash code ca sa vedem daca intr-adevar a fost efectuat doar o data initierea obiectului,
// adica daca sunt hash coduri diferite apoi e rau, nu e conform singleton, inseamna ca undeva am gresit sau a fost implementat gresit
            System.out.println(Ingrediente.getIngrediente().hashCode());
            System.out.println(Ingrediente.getIngrediente().hashCode());

            System.out.println(Ingrediente.getIngrediente().toString());

            Ingrediente.getIngrediente().addIngrediente_Rancho(" Piept de pui,\n Ardei dulci,\n Ciuperci,\n Rosii.");
            Ingrediente.getIngrediente().addIngrediente_ThaiShrimp(" Creveti,\n Dovlecei,\n Olive verzi,\n Parmesan.");

            System.out.println("\nAfisarea listelor de ingrediente:");
            Ingrediente.getIngrediente().afiseazaListaIngredienteRancho();
            Ingrediente.getIngrediente().afiseazaListaIngredienteThaiShrimp();
            Ingrediente.getIngrediente().afiseazaTotalIngrediente();

        }
}



