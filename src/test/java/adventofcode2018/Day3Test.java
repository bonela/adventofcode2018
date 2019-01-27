package adventofcode2018;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;

public class Day3Test {

	@Test
	public void info_by_one_claim() {
		
		String claim = "#123 @ 3,2: 5x4";
		String[] infoClaim = claim.split("#\\@\\:\\x"); 
		assertEquals("123", infoClaim[0]);
		
	}

}
