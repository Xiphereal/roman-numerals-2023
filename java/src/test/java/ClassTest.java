import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassTest {

	@Test
	public void Convert1toI() {
		assertEquals("I", Arabic.toRoman(1));
	}

}
