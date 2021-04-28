package module3;

public class DataMahasiswa extends DataUniv{
    static String Alamat, Jurusan;

    public static String getAlamat() {
        return Alamat;
    }

    public static void setAlamat(String Alamat) {
        DataMahasiswa.Alamat = Alamat;
    }

    public static String getJurusan() {
        return Jurusan;
    }

    public static void setJurusan(String Jurusan) {
        DataMahasiswa.Jurusan = Jurusan;
    }

}