package adventofcode2018;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class Day2 {

	final String charInCodeID = "abcdefghijklmnopqrstuvwxyz";

	public int checkSumByIDs(List<String> collectIDs) {
	
		return Math.multiplyExact(this.countOcurrences(2, collectIDs), this.countOcurrences(3, collectIDs));

	}
	
	private int countOcurrences(int times, List<String>  collectIDs) {
		
		final List<String> collectForTimes = new ArrayList<>();
		
		for (int z = 0; z < charInCodeID.length(); z++) {
			char c = charInCodeID.charAt(z);

			 collectIDs.stream().filter((current) -> StringUtils.countOccurrencesOf(current, String.valueOf(c)) == times
					&& !collectForTimes.contains(current))
					.forEach((current) -> collectForTimes.add(current.toString()));
		}
		
		return collectForTimes.size();
		
	}
	 

}
