public class Person {
    private String first;
    private String last;
    private int amtOfMeetings;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public void meet(Person anotherPerson) {
        System.out.println("Hello, my name is " + first);
        System.out.println("Hi, my name is " + anotherPerson.first);
        amtOfMeetings++;
        anotherPerson.amtOfMeetings++;
    }

    public int getMeetings() {
        return amtOfMeetings;
    }

}