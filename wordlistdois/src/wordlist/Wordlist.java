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

        char senha[]= new char[8];
        String senhas[] = new String[10000];

        int i = 0;
        int oitavo=0;
        int setimo=0;
        int sexto=0;
        int quinto=0;
        int quarto=0;
        int terceiro=0;
        int segundo=0;
        int primeiro=0;
        while (i < 10000) {
            oitavo++;
            if(oitavo>7){
                oitavo=0;
                setimo++;
            }
            if(setimo>7){
                setimo =0;
                sexto++;
            }
            if(sexto>4){
                sexto =0;
                quinto++;
            }
            if(quinto>19){
                quinto=0;
                quarto++;
            }
            if(quarto>4){
                quarto=0;
                terceiro++;
            }
            if(terceiro>19){
                terceiro=0;
                segundo++;
            }
            if(segundo>4){
                segundo=0;
                primeiro++;
            }
            if(primeiro>19){
                primeiro=0;
            }
            senha[0]=C[primeiro];
            senha[1]=B[segundo];
            senha[2]=C[terceiro];
            senha[3]=B[quarto];
            senha[4]=C[quinto];
            senha[5]=B[sexto];
            senha[6]=A[setimo];
            senha[7]=A[oitavo];

            senhas[i]= new String(senha);
            i++;
        }
        for(int j=0;j<10000;j++){
            System.out.println(senhas[j]);
        }
        
        
    }

}
