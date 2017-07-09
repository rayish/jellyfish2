package jellyfish2;
import java.util.ArrayList;
public class progress {
	public static final int GAMECOUNT = 5;
	private ArrayList<Player> players = new ArrayList<Player>();
	//プレーヤーの登録
	public void registerPlayer(Player player) {
		players.add(player);
	}
	//進行
	public void playGame() {
		for (int i = 0; i < GAMECOUNT; i++) {
			//いかさまじゃんけんの準備
			for (int j = 0; j < players.size(); j++) {
				Player player = (Player) players.get(j);
				player.prepare(j);
			}
			//じゃんけんをする
			for (int j = 0; j < players.size(); j++) {
				Player player = (Player) plaayers.get(j);
				player.play(i);		//引数は何戦目か
			}
		}
	}
}
