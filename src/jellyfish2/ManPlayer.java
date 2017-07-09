package jellyfish2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManPlayer extends Player{
	//入力する 引数：何回戦目
	@Override
	public void play(int count) {
		int you = -1;
		while (you < 0 || you > 2) {
			System.out.println(count + "回戦目 (グー:0 チョキ:1 パー:2を入力)");
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(in);
			try {
				String line = reader.readLine();
				you = Integer.parseInt(line);
				if (you<0 || you>2) {
					System.out.println("0～2までの数字を入力してください。");
				}
			} catch(IOException e) {
				System.out.println(e);
			} catch(NumberFormatException e) {
				System.out.println("0～2の数値を入力してください。");
			}
		}
		playCode = you;
	}
}