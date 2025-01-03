import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int dice = random.nextInt(6) + 1; // 1부터 6까지
        System.out.println("주사위 결과: " + dice);
    }
}

