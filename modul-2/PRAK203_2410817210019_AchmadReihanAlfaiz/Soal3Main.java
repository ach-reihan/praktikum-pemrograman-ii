package PRAK203_2410817210019_AchmadReihanAlfaiz;

/*
Menggunakan bahasa selain bahasa Inggris untuk nama kelas dan variabel adalah praktik yang kurang baik dalam pemrograman.
Sebaiknya gunakan bahasa Inggris untuk memastikan kode dapat dipahami oleh komunitas pemrograman yang lebih luas.
Namun, untuk tujuan praktikum ini, kita akan tetap menggunakan nama dalam bahasa Indonesia.
 */
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        /*
        Mengakses atribut objek secara langsung adalah praktik yang kurang baik dalam OOP karena melanggar prinsip enkapsulasi.
        Sebaiknya atribut-atribut tersebut diubah menjadi private dan diakses melalui metode getter dan setter.
         */
        // p1.nama = "Roi" ini salah karena kurang tanda titik koma
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // Menambahkan nilai umur untuk p1
        p1.umur = 17;

        // System.out.println("Nama Pegawai: " + p1.getNama()); ini salah karena yang diminta hanya nama bukan nama pegawai
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        // System.out.println("Umur: " + p1.umur); ini salah karena umur belum diinisialisasi sehingga nilainya default 0
        // dan kurang kata "tahun" di belakang umur
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
