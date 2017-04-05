
public class UF {
	private int[] id;	//分量id数组
	private int count;	//分量数量
	public UF(int N){
		//init id[]
		count = N;
		id = new int[N];
		for(int i = 0; i < N; i++ ){
			id[i] = i;
		}
	}
	public int count(){ return count; }
	public boolean connected(int p, int q){
		return find(p) == find(q);
	}
	public int find(int p){
		return	id[p];
	}
	public void union(int p, int q){
		int pID = find(p);
		int qID = find(q);
		if(pID != qID){
			for(int i = 0; i < id.length; i++){		
				if (id[i] == qID){
					id[i] = id[p];
					count--;
				}	
			}
		}
	}
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]) ;
		System.out.println("N : " + N);
		UF uf = new UF(N);
		for (int i = 1; i < N - 1; i += 2){
			int p = Integer.parseInt(args[i]);
			int q = Integer.parseInt(args[i+1]);
			if(uf.connected(p, q)) continue;
			uf.union(p, q);
			System.out.println(p + "and" + q + "has connected!");
		}
		System.out.println(uf.count() + "components");
	}
}
