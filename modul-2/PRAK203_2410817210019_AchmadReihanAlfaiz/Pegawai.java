package PRAK203_2410817210019_AchmadReihanAlfaiz;

/*
Menggunakan bahasa selain bahasa Inggris untuk nama kelas dan variabel adalah praktik yang kurang baik dalam pemrograman.
Sebaiknya gunakan bahasa Inggris untuk memastikan kode dapat dipahami oleh komunitas pemrograman yang lebih luas.
Namun, untuk tujuan praktikum ini, kita akan tetap menggunakan nama dalam bahasa Indonesia.
 */
// public class Employee { ini salah karena nama class harus sesuai dengan nama file
// public class Employee {
public class Pegawai {
    /*
    Atribut di class ini tidak menerapkan best practice dalam OOP karena atributnya bersifat public.
    Atribut yang bersifat public dapat diakses langsung dari luar kelas, yang melanggar prinsip enkapsulasi.
    Sebaiknya atribut-atribut ini diubah menjadi private dan diakses melalui metode getter dan setter.
     */
    public String nama;
    // public char asal; ini salah karena char hanya untuk satu karakter sedangkan asal bisa lebih dari satu karakter
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    // public void setJabatan() { ini salah karena tidak ada parameter j
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
