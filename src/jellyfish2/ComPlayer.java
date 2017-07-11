package jellyfish2;
import static jellyfish2.Cheaters.*;

public class ComPlayer extends Player {
	private Cheaters cheatplay;		//インチキモードジャンケン
	private Player rival;			//ライバルの状態
	//コンストラクタ
	public ComPlayer(Cheaters cheatPlay, Player mans) {
		cheatplay = cheatPlay;
		rival = mans;
	}
	//モードのセット　引数:何回戦目
	@Override
	public void prepare(int count) {
		//2敗している場合インチキ（勝ち）モードに突入
		if (rival.getScore() >= 2 && count <= 3) {
			cheatplay.setMode(WIN);
			cheatplay.setRivalCode(rival.playCode);
		} else {
			cheatplay.setMode(NORMAL);
		}
	}
	@Override
	public void play(int count) {
		playCode = cheatplay.putout();
	}
}
