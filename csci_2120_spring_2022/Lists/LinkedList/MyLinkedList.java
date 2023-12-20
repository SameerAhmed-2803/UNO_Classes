public class MyLinkedList<T> {

	// instance variables
	private int size;  // how many data elements there are
	private Node firstNode;
	private Node lastNode;

	public MyLinkedList() {
		this.size = 0;
		this.firstNode = null;
		this.lastNode = null;
	}

	public int size() {
		return size;
	}

	public void set(int index, T element) {
		if ( index >= size )
			throw new IndexOutOfBoundsException(index + " is not valid");

		int counter = 0;
		Node currentNode = this.firstNode;
		while ( counter < index ) {
			currentNode = currentNode.getNext();
			counter++;
		}
        currentNode.setElement(element);
	}


	// adds an element to "the end"
	public void add(T element) {
		Node newNode = new Node(element);
		if (size == 0) {
			this.firstNode = newNode;
			this.lastNode = newNode;
		}
		else {
			this.lastNode.setNext(newNode);
			this.lastNode = newNode;
		}
		size++;
	}

	// adds an element at a particular index
	public void add(int index, T element) {

		Node newNode = new Node(element);

		if ( index > size )
			throw new IndexOutOfBoundsException(index + " is not valid");
		if (index == size) {
			add(element);
			return;
		}

		if (index == 0) {
			newNode.setNext(this.firstNode);
			this.firstNode = newNode;
			size++;
			return;
		}

		int counter = 0;
		Node currentNode = this.firstNode;
		while ( counter < index-1 ) {
			currentNode = currentNode.getNext();
			counter++;
		}
		// overwriting references
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);
		size++;

	}

	// remove and return an element
	public T remove(int index) {

		if ( index > size )
			throw new IndexOutOfBoundsException(index + " is not valid");

		if (index == 0) {

			Node nodeToRemove = firstNode;
			this.firstNode = this.firstNode.getNext();
			T returnValue = nodeToRemove.getElement();

			nodeToRemove.setNext(null); // for garbage collection
			nodeToRemove.setElement(null); // for garbage collection
			size--;
			return returnValue;
		}

		int counter = 0;
		Node currentNode = this.firstNode;
		while ( counter < index-1 ) {
			currentNode = currentNode.getNext();
			counter++;
		}

		Node nodeToRemove;
		if (index == size -1) {
			nodeToRemove = currentNode.getNext();
			currentNode.setNext(null);

		} else {
			// any node that is not the first or last
			// overwriting references
			nodeToRemove = currentNode.getNext();
			currentNode.setNext( currentNode.getNext().getNext() );
		}

		T returnValue = nodeToRemove.getElement();

		nodeToRemove.setNext(null); // for garbage collection
		nodeToRemove.setElement(null); // for garbage collection
		size--;
		return returnValue;

	} // end remove method

	public T get(int index) {
		if ( index >= size )
			throw new IndexOutOfBoundsException(index + " is not valid");
		int counter = 0;
		Node currentNode = this.firstNode;
		while ( counter < index ) {
			currentNode = currentNode.getNext();
			counter++;
		}
		return currentNode.getElement();
	}

	public MyIterator iterator() {
		return new MyIterator();
	}

	// iterator inner class

	public class MyIterator {
		private Node currentNode;

		public MyIterator() {
			currentNode = MyLinkedList.this.firstNode;
		}

		public T next() {
			T returnValue = currentNode.getElement();
			currentNode = currentNode.getNext();
			return returnValue;
		}

		public boolean hasNext() {
			if (currentNode != null)
				return true;
			return false;
		}

	} // end inner iterator class

	private class Node {

		private T element;
		private Node next;

		public Node(T element) {
			this.element = element;
			this.next = null;
		}

		public void setNext(Node nextNode) {
			this.next = nextNode;
		}

		public Node getNext() {
			return this.next;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public T getElement() {
			return this.element;
		}

	}  // end inner class Node

} // end class
