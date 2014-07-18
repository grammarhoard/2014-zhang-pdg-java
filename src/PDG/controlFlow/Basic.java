package PDG.controlFlow;

public class Basic {
	public void testBasic(){
		int i = 0;
		int t = 5;
		i = i + t;
		System.out.println("end");
	}
	
	public void testIf(){
		int i = 0;
		if(i > 0){
			int j = 3;
			System.out.println("first " + i + j);
		}else if(i == -4){
			System.out.println("second");
		}else{
			System.out.println("third");
		}
		System.out.println("End");
	}
	
	public void testIf2(){
		int i = 0;
		if(i > 0){
			int j = 3;
			System.out.println("first " + i + j);
		}else if(i == -4){
			System.out.println("second");
		}else{
			System.out.println("third");
		}
	}
	
	public void testFor(){
		int m = 2;
		for(int i = 0; i <= m; i++){
			System.out.println("FOR");
		}
		System.out.println("END");
	}

	public void testFor2(){
		int m = 2;
		for(int i = 0, j = 7; i <= j; i++, j--){
			System.out.println("For" + m);
		}
	}
	
	public void testWhile(){
		int i = 3;
		while(i > 1){
			System.out.println("While");
			i--;
		}
		System.out.println("End");
	}
	
	public void testWhile2(){
		int i = 3;
		while(i > 1){
			System.out.println("While");
			i--;
		}
	}
}
