package ferma;

public class Cows extends Ferma{

    private Color color;
    private int milk;

    public Cows(int age, Color color, int milk) {
        super(age);
        this.color = color;
        this.milk = milk;
    }

    @Override
    public void print() {
        System.out.println("Color " + color+
                           "\nmilk : "+ milk+
                             "\nage:"+getAge());
    }
}
