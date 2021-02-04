package Singleton.Enum;

public enum Crust {

        CLASSIC("classic"),
        THIN_AND_CRISPY("thin and crispy"),
        ITALIAN("italian");

        private String crust;

        Crust(String crust){
            this.crust = crust;
        }

        @Override
        public String toString(){
            return crust;
        }
}
