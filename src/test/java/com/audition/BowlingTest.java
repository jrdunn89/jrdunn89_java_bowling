package com.audition;

import static org.junit.Assert.*;

import org.junit.*;

public class BowlingTest {

   Bowling game;

   public BowlingTest() {
   }

   @Before
   public void setUp() {
   }

   @Test
   public void gutterBalls() {
      game = new Bowling();

      fillFrames(10, 0, 0);

      assertEquals(0, game.getScore());
   }

   @Test
   public void allOnes() {
      game = new Bowling();

      fillFrames(10, 1, 1);

      assertEquals(20, game.getScore());
   }
   
   @Test
   public void spare() {
      game = new Bowling();

      game.addSpareFrame(1, 9);
      game.addFrame(5, 3);
      fillFrames(8, 0, 0);

      assertEquals(23, game.getScore());
   }

   @Test
   public void strike() {
      game = new Bowling();

      game.addStrikeFrame();
      game.addFrame(3, 5);
      fillFrames(8, 0, 0);

      assertEquals(26, game.getScore());
   }

   @Test
   public void finalFrameSpare() {
      game = new Bowling();

      fillFrames(8, 0, 0);
      game.addStrikeFrame();
      game.addSpareFrame(1, 9);
      game.addExtraRoll(1);

      assertEquals(31, game.getScore());
   }

   @Test
   public void finalFrameStrike() {
      game = new Bowling();

      fillFrames(8, 0, 0);      
      game.addSpareFrame(2, 8);
      game.addStrikeFrame();
      game.addExtraRoll(10);
      game.addExtraRoll(10);

      assertEquals(50, game.getScore());
   }

   @Test
   public void allSpares() {
      game = new Bowling();

      for (int frame = 0; frame < 10; frame++) {
         game.addSpareFrame(3, 7);
      }

      game.addExtraRoll(3);

      assertEquals(130, game.getScore());
   }

   @Test
   public void allStrikes() {
      game = new Bowling();

      for (int frame = 0; frame < 10; frame++) {
         game.addStrikeFrame();
      }

      game.addExtraRoll(10);
      game.addExtraRoll(10);

      assertEquals(300, game.getScore());
   }

   private void fillFrames(int count, int first, int second) {
      for (int frame = 0; frame < count; frame++) {
         game.addFrame(first, second);
      }
   }
}