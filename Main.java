
class Main{
	public static void main(String [] args){
		System.out.println("Start main func.");
		System.out.println(new Main());
		IntegerGenerator ig=  new IntegerGenerator();
		for(int i =0 ; i < 5; i++)
			System.out.println(ig.next());
	}
	
	public String toString(){
		return "The main class.";
	}
}