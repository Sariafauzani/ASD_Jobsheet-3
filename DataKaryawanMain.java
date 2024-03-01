import java.util.Scanner;
public class DataKaryawanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();
        scanner.nextLine(); 

        DataKaryawan[] arrayofDataKaryawan = new DataKaryawan[jumlahKaryawan];

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("Masukkan data karyawan ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Jabatan: ");
            String jabatan = scanner.nextLine(); 
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("No. Telepon: ");
            String no_Tlp = scanner.nextLine();
            arrayofDataKaryawan[i] = new DataKaryawan(nama, jabatan, alamat, no_Tlp);
        }

        for (DataKaryawan k : arrayofDataKaryawan) {
            k.displayInfo();
            k.absensiKaryawan();
        }

        System.out.println("Setelah absen:");
        for (DataKaryawan k : arrayofDataKaryawan) {
            k.displayInfo();
        }

        scanner.close();
    }
}