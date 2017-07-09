package jellyfish2;

public class ComPlayer extends Player {
	private Cheaters cheatplay;		//インチキモードジャンケン
	private Player rival;			//ライバルの状態
	//コンストラクタ
	public ComPlayer(Cheaters cheatPlay, Player mans) {
		cheatplay = cheatPlay;
		rival = mans;
	}
	//モードのセット　引数:何回戦目
	public void prepare(int count) {
		//2敗している場合インチキ（勝ち）モードに突入
		if (rival.getScore() >= 2 && count <= 3) {
			cheatplay.setMode(WIN);
			cheatplay.setRivalCode(raival.playcode);
		} else {
			cheatplay.setMode(NORMAL);
		}
	}
	public int play(int count) {
		cheatplay.putout();
	}
}
