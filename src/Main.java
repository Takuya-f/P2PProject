
public class Main {

	public static void main(String[] args) {
		Node n1 = makeNode("MyNode");
		n1.start();
	}

	private static Node makeNode(String nodeName) {
		Node n1 = new Node(nodeName);
		return n1;
	}

}
