package PDG.controlFlow;

public class If {
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
	
	public void testIf3(){
		int i = 0;
		if(i > 0) System.out.println("0");
		System.out.println("1");
	}
	
	public void testIf4(){
		int i = 0;
		if(i > 2){
			System.out.println("1");
			System.out.println("2");
		}
	}
}
