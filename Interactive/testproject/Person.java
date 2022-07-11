public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person person) {
        int compare = name.compareTo(person.name)
        return compare ? 0 : person.age - age;
    }
}
