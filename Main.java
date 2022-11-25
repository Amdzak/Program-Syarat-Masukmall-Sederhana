/**
 *
 * @author Amdzak
 */

package com.main.programpenentuansyaratmasukmall;

import java.util.Scanner;

public class ProgramPenentuanSyaratMasukMall {
    public static void main(String[] args) {
        //PEMBUATAN OBJEK SCANNER
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        boolean status_vaksin;
        double suhu;
        
        //INPUT USER
        System.out.println("=== Program masuk mall sederhana ===");
        System.out.print("Apakah anda sudah melakukan vaksin? (true/false) : ");
        status_vaksin = input.nextBoolean();
        System.out.print("Masukan hasil pengecekan suhu : ");
        suhu = input.nextDouble();
        
        //PENGESEKAN STATUS DAN SUHU
        
        if((status_vaksin == true) && (suhu <= 37.9)){
            System.out.println("\nAnda di persilahkan masuk");
        } else{
            System.out.println("\nMaaf anda tidak di perbolehkan masuk");
        }
    }
}
