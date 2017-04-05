import java.io.IOException;
public class FixedCapacityStack<Item> {
	private Item[] a;
	private int N;
	public FixedCapacityStack(int cap){
		a = (Item[]) new Object[cap];
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return N;
	}
	public void push(Item item){
		a[N++] = item; //a[N] = item ; N++;
	}
	public Item pop(){
		return a[--N];// N--;a[n];
	}
	public static void main(String[] args) throws IOException {
		for(String string : args){
			System.out.println(string);
		}
	}	
}