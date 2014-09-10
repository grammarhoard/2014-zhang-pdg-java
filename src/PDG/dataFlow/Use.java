package PDG.dataFlow;

public class Use {
	public void testUse1(){
		int i = 0;
		int j = i + 1;
		for(int m = 0; m < j; m++){
			System.out.println(m + i + j);
		}
	}
	
	public int testUse2(){
		int i = 0;
		int j = 4;
		while(i < j){
			j = j - i - 1;
			System.out.println(i++);
		}
		return i + j;
	}
}
