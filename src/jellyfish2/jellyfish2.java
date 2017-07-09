package jellyfish2;

public class jellyfish2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Player people = new ManPlayer();
		Player computer = new ComPlayer(new Cheaters(), people );
		people.play(1);
	}

}
