package org.example;

public class Builder {
    private String model;
    private String renk;
    private int yil;
    private int km;


    public String setModel() {
        return model;
    }

    public String setRenk() {
        return renk;
    }

    public int setYil(){
        return yil;
    }
    public int setKm(){
        return km;
    }
    public static class AracBuilder {
        private final Builder arac;

        public AracBuilder() {
            arac = new Builder();
        }

        public AracBuilder setModel(String model) {
            arac.model = model;
            return this;
        }

        public AracBuilder setRenk(String renk) {
            arac.renk = renk;
            return this;
        }

        public AracBuilder setYil(int yil){
            arac.yil=yil;
            return this;
        }

        public AracBuilder setKM(int km){
            arac.km=km;
            return this;
        }

        // Product örneğini döndüren metot
        public Builder build() {
            return arac;
        }
    }

    }



