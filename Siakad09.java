import java.util.Scanner;

public class Siakad09 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama, nim;
    char Kelas;
    byte Absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
    System.out.print("NAMA: ");
    nama = sc.nextLine();
    System.out.print("NIM: ");
    nim = sc.nextLine();
    System.out.print("KELAS: ");
    Kelas = sc.nextLine().charAt(0);
    System.out.print("NOMOR ABSEN: ");
    Absen = sc.nextByte();
    System.out.print("NILAI KUIS: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("NILAI TUGAS: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("NILAI UJIAN: ");
    nilaiUjian = sc.nextDouble();
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
    System.out.println("NAMA: " + nama + " NIM: " + nim);
    System.out.println("KELAS: " + Kelas + " ABSEN: " + Absen);
    System.out.println("NILAI AKHIR: " + nilaiAkhir);

    }
    

}