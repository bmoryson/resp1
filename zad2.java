package pl.bmoryson;

import java.util.ArrayList;
import java.util.Collections;
class zad2 {
    public static void main(String[] args) {
        metodaTestowa();}

    public static ArrayList<Student> generuj_studentow(int liczba) {
        ArrayList<Student> Lista_studentow = new ArrayList<>();
        for (int i = 0; i < liczba; i++) {
              Student student = new Student ();
              student.setImie("Adam");
              student.setNazwisko("Testowicz");
              student.setPESEL("1313131313");
              student.setIndex(989898L);
              student.setSrednia(4.0);
        }
        return Lista_studentow;
    }

    public static void metodaTestowa() {
        ArrayList<Student> wygenerowani_studenci = generuj_studentow(10);

        Collections.sort(wygenerowani_studenci);
        System.out.println(wygenerowani_studenci);
        wygenerowani_studenci.sort(Collections.reverseOrder());
        System.out.println(wygenerowani_studenci);
    }
}
