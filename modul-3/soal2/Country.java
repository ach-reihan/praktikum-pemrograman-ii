package soal2;

import java.util.Map;
import java.util.HashMap;

public class Country {
    private final String name, typeOfLeadership, leaderName;
    private int independenceDay, independenceMonth, independenceYear;

    public Country(String name, String typeOfLeadership, String leaderName) {
        this.name = name;
        this.typeOfLeadership = typeOfLeadership;
        this.leaderName = leaderName;
    }
    public void setIndependenceDate(int day, int month, int year) {
        this.independenceDay = day;
        this.independenceMonth = month;
        this.independenceYear = year;
    }
    public String introduceCountry() {
        if (typeOfLeadership.equals("Monarki")) {
            return String.format(
                "Negara %s mempunyai Raja bernama %s",
                this.name, this.leaderName
            );
        } else {
            return String.format(
                "Negara %s mempunyai %s bernama %s\nDeklarasi Kemerdekaan pada Tanggal %d %s %d.",
                    this.name,
                    this.typeOfLeadership,
                    this.leaderName,
                    this.independenceDay,
                    this.monthMap.get(this.independenceMonth),
                    this.independenceYear
            );
        }
    }
    public String getTypeOfLeadership() { return typeOfLeadership; }

    Map<Integer, String> monthMap = new HashMap<>();
    {
        monthMap.put(1, "Januari");
        monthMap.put(2, "Februari");
        monthMap.put(3, "Maret");
        monthMap.put(4, "April");
        monthMap.put(5, "Mei");
        monthMap.put(6, "Juni");
        monthMap.put(7, "Juli");
        monthMap.put(8, "Agustus");
        monthMap.put(9, "September");
        monthMap.put(10, "Oktober");
        monthMap.put(11, "November");
        monthMap.put(12, "Desember");
    }
}