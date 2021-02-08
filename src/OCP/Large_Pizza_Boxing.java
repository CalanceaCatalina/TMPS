package OCP;

import SRP.Prepare;

public class Large_Pizza_Boxing extends Boxing{

    private Prepare prepare;

    public Large_Pizza_Boxing(Prepare prepare){
        this.prepare=prepare;
    }

    @Override
    public void Boxing() {
        System.out.println(prepare.name + " pizza a fost pusa in cutie de tip Family, de "
                + prepare.size + " si este gata de livrare. :) ");
    }
}