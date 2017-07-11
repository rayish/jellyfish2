package jellyfish2;

public class Cheaters extends RockPaper{
	private int mode;
	private int rivalCode;				//相手コード
	public static final int NORMAL = 0;		//通常モード
	public static final int WIN = 1;			//必ず勝つモード
	public static final int LOSE = 2;		//必ず負けるモード
	//コンストラクタ
	Cheaters(){
		mode = NORMAL;
	}
	//相手のコードを取得する。
	public void setRivalCode(int code) {
		rivalCode = code;
	}
	//モードのセット
	public void setMode(int mode) {
		this.mode = mode;
	}
	//後出しじゃんけんを出す。
	public int putout() {
		switch(mode) {
		case WIN:
			return (rivalCode - 1 + 3) % 3;
		case LOSE:
			return (rivalCode - 2 + 3) % 3;
		default:
			return super.putout();
		}
	}
	//モードの確認
	public int getMode() {
		return mode;
	}
}
