package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String myChoice = " ";
		
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入れましょう");
			System.out.println("パーはpaperのpを入れましょう");
			
			myChoice = scanner.nextLine();
			
			if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				break;
			}else {
				System.out.println("正しいじゃんけんの手を入力してください");
			}
		}
		return myChoice;
	}
	public String getRandom() {
		String[] choices = {"r","s","p"};
		
		int randomIndex = (int) Math.floor(Math.random() * 3);
		
		return choices[randomIndex];
	}
	public void playGame(String myChoice,String randomChoice) {
		HashMap<String, String> handMap = new HashMap<>();
		
		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p","パー");
		
		System.out.println("自分の手は" + handMap.get(myChoice) + "、対戦相手の手は" + handMap.get(randomChoice));
		
		if (myChoice.equals(randomChoice)) {
			System.out.println("あいこです");
		}else if(
				myChoice.equals("r") && randomChoice.equals("s") ||
				myChoice.equals("s") && randomChoice.equals("p") ||
				myChoice.equals("p") && randomChoice.equals("r")
				) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}
