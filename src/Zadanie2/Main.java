package Zadanie2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadPlik readPlik = new ReadPlik();
        readPlik.sumaSprzedazyBrutto();
        readPlik.sumaSprzedazyNetto();
        readPlik.sumaVat();
    }
}
