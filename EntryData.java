package module3;
import java.util.Scanner;
public class EntryData {
    public static void main(String[] args) {
        String lanjut = "Y";
        while(lanjut.equals("Y")){
            Scanner input = new Scanner(System.in);

            System.out.println("===========================================");
            System.out.println("                 INPUT DATA               ");
            System.out.println("===========================================");
            System.out.print("UNIVERSITAS  : "); DataMahasiswa.univ = input.nextLine();
            System.out.print("NIM          : "); DataMahasiswa.NIM = input.nextLine();
            System.out.print("NAMA         : "); DataMahasiswa.nama = input.nextLine();
            System.out.print("ALAMAT       : "); DataMahasiswa.Alamat = input.nextLine();
            System.out.println("DAFTAR KODE JURUSAN :");
            System.out.println("1.MATEMATIKA          (61)");
            System.out.println("2.BIOLOGI             (62)");
            System.out.println("3.KIMIA               (63)");
            System.out.println("4.FISIKA              (64)");
            System.out.println("5.TEKNIK INFORMATIKA  (65)");
            System.out.println("6.SISTEM INFORMASI    (66)");
            System.out.print("ISI SESUAI KODE JURUSAN : "); DataMahasiswa.Jurusan = input.nextLine();
            System.out.println("  ");

            System.out.println("===========================================");
            System.out.println("               DATA MAHASISWA              ");
            System.out.println("===========================================");
            System.out.println("UNIVERSITAS : " + DataMahasiswa.getUniv());
            System.out.println("NIM         : " + DataUniv.getNIM());
            System.out.println("NAMA        : " + DataUniv.getNama());
            System.out.println("ALAMAT      : " + DataMahasiswa.getAlamat());
            switch (DataMahasiswa.getJurusan()) {
                case "61" -> System.out.println("JURUSAN     : MATEMATIKA");
                case "62" -> System.out.println("JURUSAN     : BIOLOGI");
                case "63" -> System.out.println("JURUSAN     : KIMIA");
                case "64" -> System.out.println("JURUSAN     : FISIKA");
                case "65" -> System.out.println("JURUSAN     : TEKNIK INFORMATIKA");
                case "66" -> System.out.println("JURUSAN     : SISTEM INFORMASI");
                default -> {
                    System.out.println("KODE JURUSAN TIDAK SESUAI");
                    System.out.println("  ");
                }
            }
            System.out.println("===========================================");
            System.out.println("Apakah Anda ingin memasukkan data lagi? (Iya = Y /Tidak = T)");
            System.out.print("PILIHAN : ");
            lanjut = input.nextLine();
        }

    }

}