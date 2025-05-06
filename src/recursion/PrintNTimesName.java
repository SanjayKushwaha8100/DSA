package recursion;

public class PrintNTimesName {
	static void help(String name, int count) {
//		System.out.println(name + count);
		if (count == 0) {
			return;
		}

		help(name, count-1);
		System.out.println(name + count);

	}

	public static void main(String args[]) {
		String name = "Sanjay";
		Integer count = 4;
		help(name, count);
	}

}
