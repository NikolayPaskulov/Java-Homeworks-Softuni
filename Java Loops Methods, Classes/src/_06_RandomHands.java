import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _06_RandomHands {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int counter = 0;
		
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		
		char[] suits = { '♣', '♦', '♥', '♠' };
		
		ArrayList<String> cards = new ArrayList<>();
		
		for (int i = 0; i < 13; i++) {
			
			for (int j = 0; j < 4; j++) {
				cards.add(faces[i] + suits[counter]);
				counter++;
				if(counter == 4) {
					counter -= 4;
				}
			}
		}
		
		int cardRandom = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				cardRandom = randomCard(cards);
				System.out.printf("%s ", cards.get(cardRandom));
				cards.remove(cardRandom);
			}
			System.out.println();
		}
		

	}
	
    public static int randomCard(ArrayList<String > cards)
    {
            Random random = new Random();
            int randNumber = random.nextInt(cards.size());
            return randNumber;
    }
}
