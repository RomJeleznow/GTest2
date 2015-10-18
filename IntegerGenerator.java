

public class IntegerGenerator implements Generator<Integer>{
	Integer i = Integer.valueOf(0);
	
	public Integer next(){
		return i++;
	}
}