package pl.bmoryson;
class Wykladowca extends Czlowiek {
  private String tytul_naukowy;
  private String przedmiot;

  Wykladowca (){
   System.out.println("wywołanie: konstruktor klasy wykladowca"); }

  public String getPrzedmiot() {
    return przedmiot;}

  public void setPrzedmiot(String przedmiot) {
    this.przedmiot = przedmiot;}

  public String getTytul_naukowy() {
    return nazwisko;}

  public void setTytul_naukowy(String tytul_naukowy) {
    this.tytul_naukowy = tytul_naukowy;}


  @Override
  public String toString() {
    return "Wykładowca{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +            
                ", tytul_naukowy='" + tytul_naukowy + '\'' +
                ", przedmiot='" + przedmiot + '\'' +
               '}';
  }
}
