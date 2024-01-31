
class hw {
	public static void main(String[] args) {
		System.out.println("hello world, im java");
		
		int lista[] = { 10, 20, 30, 40, 110000 };

		for (int list : lista) {
			String p = String.format("Number %1$d - ", list);
			System.out.print(p);
		}
	}
}
