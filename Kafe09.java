
import java.util.Scanner;

public class Kafe09 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        double totalHarga, nominalBayar;
        float diskon = 10 / 100f;
        System.out.print("KEANGGGOTAAN (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("JUMLAH PEMBELIAN KOPI: ");
        jmlKopi = input.nextInt();
        System.out.print("JUMLAH PEMBELIAN TEH: ");
        jmlTeh = input.nextInt();
        System.out.print("JUMLAH PEMBELIAH ROTI: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);
        System.out.println("KEANGGOTAAN PELANGGAN " + keanggotaan);
        System.out.println("ITEM PEMBELIAN " + jmlKopi + " Kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("NOMINAL BAYAR RP " + nominalBayar);
        
    }
}
