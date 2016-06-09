import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your cards: ");
		char cards[] = new char[5];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = input.next().charAt(0);
		}
		System.out.println(Arrays.toString(cards));
		Arrays.sort(cards);
		System.out.println(Arrays.toString(cards));
		for (int j = 0, i; j < cards.length; j++) {
			for (i = j + 1; i < cards.length; i++) {
				if (cards[j] != cards[i]) {
					break;
				}

			}
			if (i - j > 1) {
				switch (i - j) {
				case 2:
					System.out.println("Pair");
					break;
				case 3:
					System.out.println("3 of a kind");
					break;
				case 4:
					System.out.println("4 of a kind");
					break;
				}
				j = i;

			}

		}

	}
}
