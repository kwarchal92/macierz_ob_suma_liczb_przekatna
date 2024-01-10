package macierz_ob;

import java.util.*;

class matrix
{
    public void czytajDane(double[][]macierz, int rozmiar)
    {
        int i, j;
        Random rand = new Random(); //generowanie liczb pseudolosowych

        for (i = 0; i < rozmiar; i++)
        {
            for (j = 0; j < rozmiar; j++)
            {
                if (i == j)
                    macierz[i][j] = Math.round(9 * (rand.nextDouble())); //wpisywanie liczb pseudolosowych od 0 do 9 na przekatnej tablicy
                else
                    macierz[i][j] = 0; //wpisywanie 0 poza przekatna
            }
        }
    }

    public void przetworzDane(double[][]macierz, int rozmiar)
    {
        int i;
        double suma = 0;

        for (i = 0; i < rozmiar; i++)
            suma += macierz[i][i];

        System.out.println("\nSuma elementow na przekatnej wynosi: " + (int) suma + ".\n"); //rzutowanie

    }

    public void wyswietlWynik(double[][]macierz, int rozmiar)
    {
        int i, j;

        for(i = 0; i < rozmiar; i++)
        {
            for(j = 0; j < rozmiar; j++)
            {
                System.out.print((int) macierz[i][j] + " "); //rzutowanie
            }
            System.out.println();
        }
    }
}
public class Main
{

    public static void main(String[] args)
    {
        int rozmiar = 10;
        double [][] tablica = new double[rozmiar][rozmiar];

        matrix matrix1 = new matrix();

        matrix1.czytajDane(tablica, rozmiar);
        matrix1.przetworzDane(tablica, rozmiar);
        matrix1.wyswietlWynik(tablica, rozmiar);
    }
}
