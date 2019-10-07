/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordlist;

/**
 *
 * @author carlos
 */
public class Wordlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char A[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        char B[] = {'a', 'e', 'i', 'o', 'u'};
        char C[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z', 'k', 'y'};

        String senha = "";
        String senhas[] = new String[10000];

        int cont = 0;
        while (cont < 10000) {
            for (int i = 0; i < 8; i++) {
                //nas três primeiras posições pares coloca consoantes
                if (i % 2 == 0 && i < 5) {
                    int j = (int) (Math.random() * C.length);
                    senha += C[j];
                    //nas três primeiras posições ímpares coloca vogais
                } else if (i % 2 != 0 && i < 6) {
                    int j = (int) (Math.random() * B.length);
                    senha += B[j];
                    //nas duas últimas posições coloca os números
                } else {
                    int j = (int) (Math.random() * A.length);
                    senha += A[j];
                }
            }
            senhas[cont] = senha;
            senha = "";
            cont++;
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println(senhas[i]);
        }

    }

}
