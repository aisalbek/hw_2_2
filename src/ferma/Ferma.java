package ferma;

public abstract class Ferma implements Printable {
    private int age;

    public Ferma(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
