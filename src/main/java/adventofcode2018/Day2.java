package adventofcode2018;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class Day2 {

	final String charInCodeID = "abcdefghijklmnopqrstuvwxyz";

	public int checkSumByIDs(List<String> collectIDs) {

		final List<String> codeIDTwice = new ArrayList<>();
		final List<String> codeIDThree = new ArrayList<>();

		for (int z = 0; z < charInCodeID.length(); z++) {
			char c = charInCodeID.charAt(z);

			collectIDs.stream().filter((current) -> StringUtils.countOccurrencesOf(current, String.valueOf(c)) == 2 
					&& !codeIDTwice.contains(current))
					.forEach((current) -> codeIDTwice.add(current.toString()));
			collectIDs.stream().filter((current) -> StringUtils.countOccurrencesOf(current, String.valueOf(c)) == 3
					&& !codeIDThree.contains(current))
					.forEach((current) -> codeIDThree.add(current.toString()));
		}

		return Math.multiplyExact(codeIDTwice.size(), codeIDThree.size());

	}

}
