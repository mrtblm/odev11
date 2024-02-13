package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("**************************************");
        Builder product = new Builder.AracBuilder()
                .setModel("Clio")
                .setRenk("Beyaz")
                .setYil(2023)
                .setKM(1000)
                .build();
        System.out.println("Builder Tasarım Örneği Çalıştı !" + "\n" + "Araç Bilgileri:");
        System.out.print("Model: " + product.setModel() + " | ");
        System.out.print("Renk: " + product.setRenk()+ " | ");
        System.out.print("Yıl: " + product.setYil()+ " | ");
        System.out.print("Km: " + product.setKm());

    }
}