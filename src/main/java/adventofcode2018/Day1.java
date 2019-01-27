package adventofcode2018;

public class Day1 {

	public int resultFrecuency(int[] listOfChanges) {

		int resultFrecuency = 0;
		for (int f : listOfChanges) {
			resultFrecuency += f;
		}
		System.out.println("Creando conflicto para un merge");
		return resultFrecuency;
	}

}
