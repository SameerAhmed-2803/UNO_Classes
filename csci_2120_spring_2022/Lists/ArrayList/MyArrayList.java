public class MyArrayList<T> {

	// instance variables
	private Object[] data;  // a reference to the array where elements are stored
	private int size;  // how many data elements there are

	public MyArrayList() {
		this.data = new Object[5];
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public void set(int index, T element) {
		if ( index >= size )
			throw new IndexOutOfBoundsException(index + " is not valid");
		data[index] = element;
	}


	// adds an element to "the end"
	public void add(T element) {
		if (  size >= data.length  ) 
			expandStorage();
		data[size] = element;
		size++;

	}

	// adds an element at a particular index
	public void add(int index, T element) {

		if (  size >= data.length  ) 
			expandStorage();

		// shuffle elements down one starting at the end
		for (int i = size-1; i >= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = element;
		size++;

	}

	// remove and return an element
	public T remove(int index) {

		if ( index >= size )
			throw new IndexOutOfBoundsException(index + " is not valid");

		T returnValue = (T)(data[index]);

		for (int i=index; i< size-1; i++) {
			data[i] = data[i+1];
		}
		data[size-1] = null;
		size--;
		return returnValue;

	} // end remove method

	// private helper method to give us room to store more stuff
	private void expandStorage() {

		int newsize = size + size/2 + 1;
		Object[] expandedData = new Object[newsize];
		for (int i =0 ; i< data.length; i++) {
			expandedData[i] = data[i];
		}
		this.data = expandedData;
	}

	public T get(int index) {
		if ( index >= size )
			throw new IndexOutOfBoundsException(index + " is not valid");
		return (T)(this.data[index]);
	}

	public MyIterator iterator() {
		return new MyIterator();
	}

	// iterator inner class
	public class MyIterator {
		private int currentIndex;

		public MyIterator() {
			currentIndex = 0;
		}

		public T next() {
			T returnValue = MyArrayList.this.get(currentIndex);
			currentIndex++;
			return returnValue;
		}

		public boolean hasNext() {
			if (currentIndex < MyArrayList.this.size)
				return true;
			return false;
		}

	} // end inner iterator class

} // end class
