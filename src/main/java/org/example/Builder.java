package org.example;

public class Builder {
    private String model;
    private String renk;
    private int yil;
    private int km;


    public String getModel() {
        return model;
    }

    public String getRenk() {
        return renk;
    }

    public int getYil(){
        return yil;
    }
    public int getKm(){
        return km;
    }
    public static class AracBuilder {
        private final Builder arac;

        public AracBuilder() {
            arac = new Builder();
        }

        public AracBuilder getModel(String model) {
            arac.model = model;
            return this;
        }

        public AracBuilder getRenk(String renk) {
            arac.renk = renk;
            return this;
        }

        public AracBuilder getYil(int yil){
            arac.yil=yil;
            return this;
        }

        public AracBuilder getKM(int km){
            arac.km=km;
            return this;
        }

        // Product örneğini döndüren metot
        public Builder build() {
            return arac;
        }
    }

    }



