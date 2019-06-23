import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        int nota = new Random().nextInt(10);

        switch (nota){
            case 10:
            case 9 :
                System.out.println("topzera");
            case 8:
            case 7:
                System.out.println("ok...");
            default:
                System.out.println("Bombou");
        }
    }
}
