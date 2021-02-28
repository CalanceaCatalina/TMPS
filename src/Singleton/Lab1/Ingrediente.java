package Singleton.Lab1;

public class Ingrediente {
    //se declara private ca sa nu poata fi accesata din afara clasei
    // un string care sa introduca lista ingredientelor folosite pentru pizza rancho si thai shrimp
    private String ListaIngrediente_Rancho = "Lista Ingrediente pentru pizza Rancho: \n";
    private String ListaIngrediente_ThaiShrimp = "Lista Ingrediente pentru pizza Thai Shrimp: \n";

    // Cream constructorul privat ca sa impiedicam aplicatia client sa utilizeze constructorul
    // daca apare de mai multe ori, inseamna ca a fost implemenatat gresit singleton si se creaza mai multe obiecte
    private Ingrediente(){
        System.out.println("Lista de ingrediente a fost initiata cu succes! :) ");
    }

// Initializare lenesa Synchronized Accessor - performanta slaba
    private static Ingrediente instance;

    public static synchronized Ingrediente getIngrediente() {
        if (instance == null) {
            instance = new Ingrediente();
        }
        return instance;
    }

    // am facut metodele publice ca sa adaugam ingredientele din clasa unde va fi metoda main
    public void addIngrediente_Rancho(String add_produse){
        ListaIngrediente_Rancho += add_produse + "\n";
    }
    public void addIngrediente_ThaiShrimp(String add_produse){ ListaIngrediente_ThaiShrimp += add_produse + "\n";  }

    public void afiseazaListaIngredienteRancho(){
        System.out.println(ListaIngrediente_Rancho);
    }
    public void afiseazaListaIngredienteThaiShrimp(){ System.out.println(ListaIngrediente_ThaiShrimp);
    }
    public void afiseazaTotalIngrediente(){
        System.out.println("Lista tuturor ingredientelor:\n"
                +ListaIngrediente_Rancho + ListaIngrediente_ThaiShrimp);
    }
}
