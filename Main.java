import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit mela = new Fruit("mela");
        Fruit pera = new Fruit("pera");
        LinkedList<Fruit> cestoDiFrutta = new LinkedList<>();
        cestoDiFrutta.add(mela);
        cestoDiFrutta.add(pera);
        System.out.println(cestoDiFrutta);
        System.out.println("--------------------");
        cestoDiFrutta.addFirst(new Fruit("cocomero"));
        System.out.println(cestoDiFrutta);
        cestoDiFrutta.addLast(new Fruit("pompelmo"));
        System.out.println("--------------------");
        System.out.println(cestoDiFrutta);
    }
}