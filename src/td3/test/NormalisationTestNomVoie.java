package td3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import td3.Normalisation.NormalisationNomVoie;

public class NormalisationTestNomVoie {
	@Test
	public void testNormalizeBoul() {
		assertEquals(NormalisationNomVoie.normalize("boul "), "boulevard ");
	}
}
