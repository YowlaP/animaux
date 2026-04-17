package structures;

public class NumPuceException extends Exception {
	
	private String mauvaisNum;
	
	public NumPuceException(String mauvaisNum) {
		this.mauvaisNum = mauvaisNum;
	}
	
	@Override
	public String toString() {
		
		return "NumPuceException : " + mauvaisNum + " inexistant";
	}
	
	

}
