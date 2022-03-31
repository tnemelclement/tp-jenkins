package service;

import java.util.Random;

public class RandomNumberProvider implements IRandomNumberProvider {
    private int max;
    private Random rdm;

    public RandomNumberProvider(int max) {
        this.max = max;
        rdm = new Random();
    }

    public int getRdm() {
        return rdm.nextInt(max);
    }
}
