package repl;

import java.util.Scanner;

public class R88CatsAndDogs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;

		String word = scan.next();

		for (int i = 0; i < word.length(); i++) {
			if(word.substring(i).startsWith("cat")) {
				countOfCats++;
			} else if (word.substring(i).startsWith("dog")) {
				countOfDogs++;
			}
					}
		boolean pets = countOfCats == countOfDogs;

		System.out.println(pets);

	}

}
