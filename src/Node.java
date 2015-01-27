import java.util.Scanner;

public class Node {
	private State state = State.IDLE;
	private String name = null;

	public Node(String name) {
		this.name = name;
	}

	public boolean start() {
		if (this.state == State.IDLE) {
			System.out.println(this.name + " is start!");
			this.state = State.LEECHING;
			Scanner scan = new Scanner(System.in);
			String str = scan.next();
			if (str.equals("c")) {
				cancel();
			} else {
				/* é¿ç€ÇÕDLèàóùÅCèIÇÌÇ¡ÇΩÇÁcompleted */
				completed();
			}
			scan.close();
			return true;
		} else {
			System.out.println(this.name + "'s state is not IDLE.");
		}
		return false;
	}

	public boolean cancel() {
		if (this.state != State.IDLE) {
			System.out.println(this.name + " is canceled.");
			this.state = State.IDLE;
			return true;
		} else {
			System.out.println(this.name + " is already idling.");
		}
		return false;
	}

	public boolean completed() {
		if (this.state == State.LEECHING) {
			System.out.println(this.name + "'s download is completed!");
			this.state = State.SEEDING;
			Scanner scan = new Scanner(System.in);
			String str = scan.next();
			while (true) {
				if (str.equals("c")) {
					cancel();
					scan.close();
					return true;
				} else {
					str = scan.next();
				}
			}
		} else {
			System.out.println(this.name + " is not downloading.");
		}
		return false;
	}
}
