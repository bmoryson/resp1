package pl.bmoryson

class Czlowiek {
  protected String imie;
  protected String nazwisko;
  protected String PESEL;

  Czlowiek (){
   System.out.println("wywolano konstruktor klasy człowiek"); 
  }

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public String getPESEL(){
    return PESEL;
  }
  
  public void setPESEL(String PESEL) {
    this.PESEL = PESEL;
  }

  @Override
  public String toString() {
    return "Czlowiek{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
  }
}
