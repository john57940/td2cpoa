package td3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import td3.Normalisation.NormalisationNumeroVoie;

public class NormalisationTestNumeroVoie {

	@Test
	public void testNormalizeNumAdd() {
		assertEquals(NormalisationNumeroVoie.normalize(3, "rue des alouettes"), "3,rue des alouettes");
	}
}
