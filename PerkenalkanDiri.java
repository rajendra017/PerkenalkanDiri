
package Scanner;

import java.util.Scanner;

public class PerkenalkanDiri {
   
    public static void main(String[] args){
        
        //MEMBUAT OBJEK UNTUK SCANNER
        Scanner input = new Scanner (System.in);
        System.out.println("PERKENALKANDIRI");
        
        System.out.println("=====================");
        System.out.println(">>>>>ISI BIODATA<<<<<");
        System.out.println("=====================");
        
        System.out.print("Nama Lengkap? : ");
        String nama = input.nextLine();
        
        System.out.print("Asal? : ");
        String asal = input.nextLine();
        
        System.out.print("Alamat sekarang? : ");
        String alamat = input.nextLine();
        
        System.out.print("Alumni? : ");
        String alumni = input.nextLine();
        
        System.out.print("UKT kelompok berapa? : ");
        
        
        //MENAMPILKAN HASIL INPUTAN DARI USER
        System.out.println("");
        
        System.out.println("~~~~~~~~~~~");
        
        System.out.println("PERKENALKAN");
        
        System.out.println("~~~~~~~~~~~");
        
        System.out.println("Nama saya " + nama);
        
        System.out.println("Asal dari " + asal);
        
        System.out.println("Alamat saya sekarang di " + alamat);
        
        System.out.println("Saya Alumni dari " + alumni);
        
       
    }   
    
}
