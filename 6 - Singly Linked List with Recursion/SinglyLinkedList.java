
public class SinglyLinkedList {
	private Node root;

	public SinglyLinkedList() {
		root = new Node();
		root.l = null;
		root.next = null;
	}

	public boolean insert(Listing newListing) {
		Node n = new Node();
		if (n == null)
			return false;
		else {
			n.next = root.next;
			root.next = n;
			n.l = newListing.deepCopy();
			return true;
		}
	}

	public Listing fetch(String targetKey) {
		Node p = root.next;
		while (p != null && !(p.l.compareTo(targetKey) == 0)) {
			p = p.next;
		}
		if (p != null)
			return p.l.deepCopy();
		else
			return null;
	}

	public boolean delete(String targetKey) {
		Node q = root;
		Node p = root.next;
		while (p != null && !(p.l.compareTo(targetKey) == 0)) {
			q = p;
			p = p.next;
		}
		if (p != null) {
			q.next = p.next;
			return true;
		} else
			return false;
	}

	public boolean update(String targetKey, Listing newListing) {
		if (delete(targetKey) == false)
			return false;
		else if (insert(newListing) == false)
			return false;
		return true;
	}

	public void showAll() {
		Node p = root.next;
		while (p != null) {
			System.out.println(p.l.toString());
			p = p.next;
		}
	}
	
	public void showAllRecursive() {
		Node p = root.next;
		showAllRecursive(p);
	}
	
	public void showAllRecursive(Node p) {
		if(p == null)
			return;
		else {
			System.out.println(p.l.toString());
			showAllRecursive(p.next);
		}
	}

	public class Node {
		private Listing l;
		private Node next;

		public Node() {
		}
	}
}