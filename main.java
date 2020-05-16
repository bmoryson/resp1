package pl.bmoryson
class Main {
  public static void main(String[] args) {
    
    Czlowiek o1 = new Czlowiek ();
    o1.setImie("Andrzej");
    o1.setNazwisko("Kowalski");
    o1.setPESEL("1212121212");
    
    Student student = new Student ();
    student.setImie("Adam");
    student.setNazwisko("Testowicz");
    student.setPESEL("1313131313");
    student.setIndex(989898L);
    student.setSrednia(4.0);
    
    Wykladowca wykladowca = new Wykladowca ();
    wykladowca.setImie("Michał");
    wykladowca.setNazwisko("Michałowicz");
    wykladowca.setPESEL("1414141414");
    wykladowca.setTytul_naukowy("Magister");
    wykladowca.setPrzedmiot("Matematyka");
    
    System.out.println(wykladowca);
  }
}
