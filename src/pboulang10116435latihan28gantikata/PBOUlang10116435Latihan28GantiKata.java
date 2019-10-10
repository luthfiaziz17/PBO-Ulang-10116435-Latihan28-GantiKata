/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang10116435latihan28gantikata;
import java.util.Scanner;

/**
 *
 * @author Luthfi
 * NIM : 10116435
 */
public class PBOUlang10116435Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String kata1;
        String kata2;
        String kata3;

        Scanner kata = new Scanner(System.in);

        System.out.println("===Program Mengganti Kalimat===");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kata1 = kata.nextLine();
        System.out.print("Ganti Kata : ");
        kata2 = kata.next();
        System.out.print("Menjadi Kata : ");
        kata3 = kata.next();

        //Proses Penggantian kata
        System.out.println("\n"+"===Hasil Formatting===");
        System.out.println("Kalimat awal : " + kata1);
        String kataBaru = kata1.replace(kata2, kata3);
        System.out.println("Kalimat Baru : " + kataBaru);
    }
    
    
}
