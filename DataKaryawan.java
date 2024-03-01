public class DataKaryawan {
    String nama;
    String jabatan;
    String alamat;
    String no_Tlp;
    int absensi;

    public DataKaryawan(String nama, String jabatan, String alamat, String no_Tlp) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.no_Tlp = no_Tlp;
        this.absensi = 0;
    }

	public void absensiKaryawan() {
        this.absensi++;
    }

    public void displayInfo() {
        System.out.println("==============================");
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Alamat: " + alamat);
        System.out.println("No. Telepon: " + no_Tlp);
        System.out.println("Absensi: " + absensi);
        System.out.println("==============================");
    }

    public String Nama() {
        return nama;
    }
}