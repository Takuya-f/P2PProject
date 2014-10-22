import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Node> nodeList = new ArrayList<Node>();
		Node n1 = makeNode("MyNode",nodeList);
		Node n2 = makeNode("OtherNode",nodeList);
		n1.start();
	}

	private static Node makeNode(String nodeName,List<Node> list) {
		Node n1 = new Node(nodeName);
		list.add(n1);
		return n1;
	}

}
