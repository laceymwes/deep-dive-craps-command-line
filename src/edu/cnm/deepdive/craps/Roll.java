package edu.cnm.deepdive.craps;

import java.util.Random;

public class Roll {

  private int[] dice;
  private static Random defaultRng;

  Roll() {
    // TODO Make thread-safe
    this((defaultRng == null) ? defaultRng = new Random() : defaultRng);
  }

  Roll(Random rng) {
    dice = new int[]{
        rng.nextInt(6) + 1,
        rng.nextInt(6) + 1
    };
  }

  public int[] getDice() {
    return new int[]{
        dice[0],
        dice[1]
    };
  }

  public int getSum() {
    return dice[0] + dice[1];
  }
}
