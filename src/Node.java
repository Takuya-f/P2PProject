public class Node {
	private State state = State.IDLE;
	private String name = null;

	public Node(String name) {
		this.name = name;
	}

	public boolean start() {
		if (this.state == State.IDLE) {
			System.out.println(this.name + " is start!");
			return true;
		} else {
			System.out.println(this.name + "'s state is not IDLE.");
		}
		return false;
	}

	public boolean cancel() {
		return false;
	}

	public boolean completed() {
		return false;
	}
}
