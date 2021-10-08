package td3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import td3.Normalisation.NormalisationPays;

public class NormalisationTestPays {

	@Test
	public void testNormalizeBelgium() {
		assertEquals(NormalisationPays.normalize("belgium"), "Belgique");
	}
}
