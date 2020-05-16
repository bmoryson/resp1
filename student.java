package pl.bmoryson;
class Student extends Czlowiek implements Comparable<Student> {
  private long index;
  private double srednia;

  Student() {
    System.out.println("wywołanie: konstruktor klasy student");}

  public long getIndex() {
    return index;}

  public void setIndex(long index) {
    this.index = index;}
  
  public double getSrednia() {
    return srednia;}

  public void setSrednia(double srednia) {
    this.srednia = srednia;}

  @Override
  public String toString() {
    return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +
                "index='" + index + '\'' +
                ", srednia='" + srednia + '\'' +
                '}';}

  @Override
  public int compareTo(Student student) {
    if (student.getIndex() == index)
      return 0;
    else if (student.getIndex() < index)
      return 1;
    else
      return -1; 
  }
}
