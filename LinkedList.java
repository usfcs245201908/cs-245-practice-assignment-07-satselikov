public class LinkedList <T> implements List {
	Node head;
	int size;
	
	LinkedList()
	{
		this.head = new Node(null);
		this.size = 0;
	}

	public void add(Object item)
	{
		if(head.data==null)
		{
			head = new Node(item);
//			Node n = new Node(item);
			size++;
		}
		else
		{
			Node node = new Node(item);
			Node prev = head;
			while(prev.next != null)
			{
				prev = prev.next;
			}
			prev.next = node;
			size++;
			}
		}
	public void add(int pos, Object item)
	{
		if(pos+1>size || pos<0)
		{
			System.out.println("out of bounds.");
		}
		if(pos==0)
		{
			Node node = new Node(item);
			node.next = head;
			head = node;
			size++;
		}
		else
		{
			Node prev = head;
			for(int i=0; i<pos; i++)
			{
				prev = prev.next;
			}
			Node newNode = new Node(item);
			newNode.next = prev.next;
			prev.next = newNode;
			size++;
		}
	}

	public Object remove(int pos) {
		if (pos > size || pos < 0) {
			System.out.println("out of bounds");
			return null;
		}
		if (pos == 0) {
			Node node = head;
			head = head.next;
			--size;
			return node.data;
		} else {
			Node prev = head;
			for (int i = 0; i < pos; i++) {
				prev = prev.next;
			}
			Node node = prev.next;
			prev.next = node.next;
			--size;
			return node.data;

		}
	}

	public Object get(int pos) {
		Node current = head;
		int count = 0;
		
		while(current != null)
		{
			if(count == pos)
			{
				return current.data;
			}
			++count;
			current = current.next;
		}
		
		return null;
	}
	
	public int size() {
		
		return this.size;
	}

}
	