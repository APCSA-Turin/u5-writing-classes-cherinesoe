public class Main {
    public static void main(String[] args) {
      Students alan = new Students("Alan Turing", 11, "Brooklyn Tech");
      Students geena = new Students("Geena Davis", 7, "Academy Middle School");
      Students paul = new Students("Paul Rudd", 2, "Bright Elementary School");
      Students ada = new Students("Ada Lovelace", 5);
      Students mary = new Students("Mary Truman", 6);
      Students cindy = new Students("Cindy Long", 10);
      Students martha = new Students("Martha Stewart", 0);
      Students rod = new Students("Rod Stewart", 13);
  
      System.out.println(alan.studentInfo());
      System.out.println(geena.studentInfo());
      System.out.println(paul.studentInfo());
      System.out.println(ada.studentInfo());
      System.out.println(mary.studentInfo());
      System.out.println(cindy.studentInfo());
      System.out.println(martha.studentInfo());
      System.out.println(rod.studentInfo());
    }
  }
  