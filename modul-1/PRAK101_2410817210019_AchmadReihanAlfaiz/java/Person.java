package PRAK101_2410817210019_AchmadReihanAlfaiz.java;

public class Person {
    private String fullName, birthPlace, birthMonth;
    private int birthDay, birthYear, height;
    private double weight;

    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setBirthPlace(String birthPlace) { this.birthPlace = birthPlace; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }
    public void setBirthMonth(String birthMonth) {
        switch(birthMonth) {
            case "1", "01", "Januari" -> birthMonth = "Januari";
            case "2", "02", "Februari" -> birthMonth = "Februari";
            case "3", "03", "Maret" -> birthMonth = "Maret";
            case "4", "04", "April" -> birthMonth = "April";
            case "5", "05", "Mei" -> birthMonth = "Mei";
            case "6", "06", "Juni" -> birthMonth = "Juni";
            case "7", "07", "Juli" -> birthMonth = "Juli";
            case "8", "08", "Agustus" -> birthMonth = "Agustus";
            case "9", "09", "September" -> birthMonth = "September";
            case "10", "Oktober" -> birthMonth = "Oktober";
            case "11", "November" -> birthMonth = "November";
            case "12", "Desember" -> birthMonth = "Desember";
            default -> birthMonth = "Invalid Month";
        }
        this.birthMonth = birthMonth;
    }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
    public void setHeight(int height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getInfo() {
        return String.format("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\n" +
                        "Tinggi Badan %d cm dan Berat Badan %.2f kilogram",
                fullName, birthPlace, birthDay, birthMonth, birthYear,
                height, weight);
    }
}
