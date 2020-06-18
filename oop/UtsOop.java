/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.oop;
import java.until.Scanner;

public class UtsOop {
    double harga,total,bayar,kembalian;
    int pil,jumlah;
    public static void main(String[] args) {
      scanner input = new Scanner(System.in);
      MainProgram in = new Mainprogram();
      System.out.println("===========");
      System.out.println("Warung kopi Adzkia 124");
      do{
          System.out.println("========");
          System.out.println("Menu : ");
          System.out.println("1. Vietnam Drip (Rp.10.000)");
          System.out.println("2. Robusta (Rp.8000)");
          System.out.println("\n9 Selesai dan hitung pembayaran");
          System.out.println("0. keluar program"); 
          System.out.println("masukan pilihan");
          in.pil = input.nextInt;
          if (in.pil>1 & in.pil<=3); 
          
      }
    }
    
}
