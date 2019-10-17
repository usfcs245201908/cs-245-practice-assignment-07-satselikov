import java.util.Arrays;

public class ArrayList <T> implements List{
	Object []a;
	int size; 
	int pos;
	
	public ArrayList()
	{
		a = new Object[10];
		this.size = 0;
	}
	public void add(Object item)
	{
		if(size == a.length)
			growArray();
		a[size++] = item;
	}
	public void add(int pos, Object item)
	{
		if(pos<0 || pos>size)
			System.out.println("Out of bounds.");
		if(size == a.length)
			growArray();
		for(int i=size-1; i>pos;i--)
			a[i+1] = a[i];
		a[pos]=item;
		++size;
	}
	void growArray()
	{
		Object[] new_a = Arrays.copyOfRange(a, 0, a.length*2);
		a = new_a;
	}

	public Object get(int pos) {
		if(pos<0 || pos>size)
			System.out.println("Out of bounds");
		return a[pos];
	}
	public Object remove(int pos) {
		if(pos<0 || pos>size)
			System.out.println("Out of bounds");
		Object temp = a[pos];
		for(int i =pos; i<size()-1;i++)
			a[i]=a[i+1];
		--size;
		return temp;
	}

	public int size() {
		return this.size;
	}
	
}
