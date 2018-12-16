package adventofcode2018;

public class Day1 {

	public int resultFrecuency(int[] listOfChanges) {

		int resultFrecuency = 0;
		for (int f : listOfChanges) {
			resultFrecuency += f;
		}

		return resultFrecuency;
	}

}
