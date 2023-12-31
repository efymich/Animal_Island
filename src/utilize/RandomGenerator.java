package utilize;

import java.util.SplittableRandom;

public class RandomGenerator {
    private static final SplittableRandom random = new SplittableRandom();

    public boolean beEaten(Double probability) {
        return random.nextDouble(0, 1) <= probability;
    }

    public int getRandomCountOnCell(int countOnCell) {
        return random.nextInt(countOnCell);
    }
}
