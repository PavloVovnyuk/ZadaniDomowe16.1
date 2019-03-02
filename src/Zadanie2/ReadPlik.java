package Zadanie2;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadPlik {
    ArrayList<Product> produkty;

    {
        try {
            produkty = createLista();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> createLista() throws IOException {
        File file = new File("plik.txt");
        file.createNewFile();
        ArrayList<Product> listaProduktow = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            listaProduktow.add(conversion(scanner.nextLine()));
        }
        System.out.println(listaProduktow);
        return listaProduktow;
    }

    public Product conversion(String lineFromFile) {
        List<String> listaProduktow1 = Arrays.asList(lineFromFile.split(","));
        String nazwa = (listaProduktow1.get(0));
        double cena = Double.parseDouble(listaProduktow1.get(1));
        double stawka = Double.parseDouble(listaProduktow1.get(2));
        Product product = new Product(nazwa, cena, stawka);
        return product;
    }

    public void sumaSprzedazyBrutto() {
        Product product1 = produkty.get(0);
        Product product2 = produkty.get(1);
        BigDecimal sumProd1 = BigDecimal.valueOf(product1.cena);
        BigDecimal sumProd2 = BigDecimal.valueOf(product2.cena);
        BigDecimal allSumBrutto = sumProd1.add(sumProd2);
        System.out.println("suma produktów brutto = " + allSumBrutto);
    }

    public void sumaSprzedazyNetto() {
        BigDecimal prod1CenaNetto = BigDecimal.valueOf(produkty.get(0).getCena() - (produkty.get(0).getCena() * 0.23));
        BigDecimal prod2CenaNetto = BigDecimal.valueOf(produkty.get(1).getCena() - (produkty.get(1).getCena() * 0.23));
        BigDecimal allSumNetto = prod1CenaNetto.add(prod2CenaNetto);
        System.out.println("suma produktów netto = " + allSumNetto);
    }

    public void sumaVat() {
        BigDecimal vat1 = BigDecimal.valueOf(produkty.get(0).getCena() * 0.23);
        BigDecimal vat2 = BigDecimal.valueOf(produkty.get(1).getCena() * 0.23);
        BigDecimal sumVat = vat1.add(vat2);
        System.out.println("suma Vat = " + sumVat);
    }
}

