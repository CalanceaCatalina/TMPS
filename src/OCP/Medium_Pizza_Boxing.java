package OCP;

import SRP.Prepare;

//tipul de cutii -> derivatele la boxing general
// aceasta clasa mosteneste si face override la metoda clasei abstracte mostenite
public class Medium_Pizza_Boxing extends Boxing{

    // declararea unei variabile de tip prepare care va servi ulterior ca setter
    private Prepare prepare;

    // setterul insasi
    public Medium_Pizza_Boxing(Prepare prepare){
        this.prepare=prepare;
    }

    // trebuie de implementat metoda abstracta a clasei abstracte Boxing
    @Override
    public void Boxing() {
        System.out.println(prepare.name + " pizza a fost pusa in cutie de tip Medium, de "
                + prepare.size + " si este gata de livrare. :) ");
    }
}
