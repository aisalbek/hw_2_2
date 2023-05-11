import ferma.*;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Cows"), createObject("Chicens"), createObject("Rams")};
        for (Printable printable : printables) {
            printable.print();
        }

    }

    public static Printable createObject(String className) {

        switch (className) {
            case "Cows":
                Cows cows = new Cows(3, Color.BLACK, 5);
                return cows;
            case "Chicens":
                Chicens chicens = new Chicens(2, 1);
                return chicens;
            case "Rams":
                Rams rams = new Rams(4, "galand", 5);
                return rams;
            default:
                System.out.println("net takoi obekt");
        }
        return null;
    }
}