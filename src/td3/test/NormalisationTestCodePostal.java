package td3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import td3.Normalisation.NormalisationCodePostal;

public class NormalisationTestCodePostal {

	@Test
	public void testNormalizeCode() {
		assertEquals(NormalisationCodePostal.normalize(" L-2270"), "2270");
	}
}
