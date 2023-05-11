package ferma;

public class Rams extends Ferma {
 private String breed;
 private int wool;

    public Rams(int age, String breed, int wool) {
        super(age);
        this.breed = breed;
        this.wool = wool;
    }

    @Override
    public void print() {
        System.out.println("breed : "+ breed+
                           "\nwool : "+ wool+
                           "\nage:"+getAge());
    }
}
