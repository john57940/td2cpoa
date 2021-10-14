package td3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalisationTestAdresse {
	
	@Test
	public void testNormalizeNumAdd() {
		assertEquals(NormalisationAdresse.normalize("3 rue des alouettes"), "3, rue des alouettes");
	}
}
