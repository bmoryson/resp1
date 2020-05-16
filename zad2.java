package pl.bmoryson;

import java.util.ArrayList;
import java.util.Collections;
class zad2 {
    public static void main(String[] args) {

        metodaTestowa();

    }

    public static ArrayList<Student> generuj_studentow(int liczba) {
        ArrayList<Student> Lista_studentow = new ArrayList<>();
        for (int i = 0; i < liczba; i++) {
            Student student = new Student();
            student.setImie("Robert");
            student.setNazwisko("Nowak");
            student.setPESEL("9283849213");
            student.setIndex(472638L + i);
            student.setSrednia(4.5);
            Lista_studentow.add(student);

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
