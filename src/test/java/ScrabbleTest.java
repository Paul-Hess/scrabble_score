import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {
  @Test
  public void Scrabble_shouldReturnCorrespondingIntegerOfString_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calcScore("a"));
  }

  @Test
  public void Scrabble_shouldReturnCorrespondingSumsOfStrings_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 18;
    assertEquals(expected, testScrabble.calcScore("qx"));
  }

  @Test
  public void Scrabble_shouldReturnCorrespondingSumsOfAllLetters_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 87;
    assertEquals(expected, testScrabble.calcScore("abcdefghijklmnopqrstuvwxyz"));
  }



}
