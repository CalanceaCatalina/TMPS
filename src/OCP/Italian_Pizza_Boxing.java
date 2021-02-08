package OCP;

import SRP.Prepare;

public class Italian_Pizza_Boxing extends Boxing{

    private Prepare prepare;

    public Italian_Pizza_Boxing(Prepare prepare){
        this.prepare=prepare;
    }

    @Override
    public void Boxing() {
        System.out.println(prepare.name + " pizza a fost pusa in cutie de tip Italian, de "
                + prepare.size  + " si este gata de livrare. :) ");
    }
}