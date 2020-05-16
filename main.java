package pl.bmoryson
class Main {
  public static void main(String[] args) {
   int wiek = 18; 
    
    Czlowiek o1 = new Czlowiek ();
    o1.setImie("Janusz");
    o1.setNazwisko("Błaszczyk");
    o1.setPESEL("3214321432");
    
    Student student = new Student ();
    student.setImie("Robert");
    student.setNazwisko("Nowak");
    student.setPESEL("9283849213");
    student.setIndex(472638L);
    student.setSrednia(4.5);
    
    Wykladowca wykladowca = new Wykladowca ();
    wykladowca.setImie("Arkadiusz");
    wykladowca.setNazwisko("Patyk");
    wykladowca.setPESEL("123456789");
    wykladowca.setTytul_naukowy("Doktor");
    wykladowca.setPrzedmiot("Fizyka");

  

    
    System.out.println(wykladowca);
  }
}
