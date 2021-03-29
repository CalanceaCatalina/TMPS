package Singleton.Enum;

public enum Size {

        MEDIUM("25"),
        ITALIAN("30"),
        LARGE("35"),
        FAMILY("40"),
        CALZONE("30");

        private String size;

        Size(String size){
            this.size = size;
        }

        @Override
        public String toString(){
            return size + "cm";
        }
}
