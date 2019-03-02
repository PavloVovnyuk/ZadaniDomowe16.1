package Zadanie2;

public class Product {
    String nazwa;
    double cena;
    double stawka;

    public Product(String nazwa, double cena, double stawka) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.stawka = stawka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getStawka() {
        return stawka;
    }

    public void setStawka(double stawka) {
        this.stawka = stawka;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", stawka=" + stawka +
                '}';
    }
}