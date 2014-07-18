package PDG.controlFlow;

public class ComStatements {
	public void test1(){
		int i = 0;
		if(i > 3){
			for(int j = 0; j <= i; j++){
				System.out.println(j);
			}
			System.out.println("end for");
		}else{
			while(i < 9){
				System.out.println(i);
				i += 3;
			}
		}
		System.out.println("End");
	}
}
