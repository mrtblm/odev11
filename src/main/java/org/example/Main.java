package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("**************************************");
        Builder product = new Builder.AracBuilder()
                .getModel("Clio")
                .getRenk("Beyaz")
                .getYil(2023)
                .getKM(1000)
                .build();
        System.out.println("Builder Tasarım Örneği Çalıştı !" + "\n" + "Araç Bilgileri:");
        System.out.print("Model: " + product.getModel() + " | ");
        System.out.print("Renk: " + product.getRenk()+ " | ");
        System.out.print("Yıl: " + product.getYil()+ " | ");
        System.out.print("Km: " + product.getKm());

    }
}