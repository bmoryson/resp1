package pl.bmoryson;


public class Zad3 {
    public static void main(String[] args) {
        Czlowiek o1 = new Czlowiek();
        Czlowiek o2 = new Student();
        Czlowiek o3 = new Wykladowca();
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
    }
//metoda toString została nadpisana z klasy Człowiek została napisana przez metode z klasy dziedziczącej po niej
//

}
