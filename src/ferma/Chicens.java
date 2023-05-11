package ferma;


public class Chicens extends Ferma{
    private int wight;

    public Chicens(int age, int wight) {
        super(age);
        this.wight = wight;
    }

    @Override
    public void print() {
        System.out.println("wight : "+wight+
                           "\nage:"+getAge());
    }
}
