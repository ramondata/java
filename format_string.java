
class printer_data {
	public static void main(String[] args) {
		//my code to print few data in the screen using java.

		int age = 31;
		String ageUnit = "years old";
		String firstName = "Ramon";
		String lastName = "Barbosa";
		double weight = 86.0;
		String weightUnit = "kg";
		double length = 1.75;
		String lengthUnit = "m";

		String totalAge = String.format("%1$s %2$s\t", age, ageUnit);
		String fullName = String.format("%1$s %2$s\t", firstName, lastName);
		String totalWeight = String.format("%s %s\t", weight, weightUnit);
		String totalLength = String.format("%1$s %2$s", length, lengthUnit);

		System.out.print(totalAge);
		System.out.print(fullName);
		System.out.print(totalWeight);
		System.out.println(totalLength);

		Boolean condicao = age <= 40;

		if (condicao) {
			String stageAge = "stage_before_or_actually_30";
			System.out.println(String.format("%2$s %1$s\t", totalAge, stageAge));
		} else {
			String stageAge = "stage_after_30";
			System.out.println(String.format("%1$s %2$s", totalAge, stageAge));
		}
	}
}
