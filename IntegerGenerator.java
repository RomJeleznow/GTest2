

public class IntegerGenerator{
	Integer i = Integer.valueOf(0);
	
	Integer next(){
		return i++;
	}
}