package jellyfish2;

public class Player {
	int totalScore;	//トータル勝ち数
	int playCode;		//0:グー,1:パー,2:チョキ
	//コンストラクタ
	Player() {
		totalScore = 0;
	}
	//トータルスコアの呼出し
	public int getScore() {
		return totalScore;
	}
	//勝ったときの加算
	public void addScore() {
		totalScore++;
	}
	//選ばれたジャンケンコード
	public int getCode() {
		return playCode;
	}
	//いかさまじゃんけんの準備
	public void prepare(int count) {
	}
	//じゃんけんをする
	public void play(int count) {
	}
}
