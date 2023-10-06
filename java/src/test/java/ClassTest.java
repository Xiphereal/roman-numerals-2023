import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassTest {

	@Test
	public void Convert1toI() {
		assertEquals("I", Arabic.toRoman(1));
	}

  @Test
  public void Convert2toII() {
    assertEquals("II", Arabic.toRoman(2));
  }

  @Test
  public void Convert3toIII() {
    assertEquals("III", Arabic.toRoman(3));
  }
  @Test
  public void Convert5toV() {
    assertEquals("V", Arabic.toRoman(5));
  }
  @Test
  public void Convert6toVI() {
    assertEquals("VI", Arabic.toRoman(6));
  }
}
