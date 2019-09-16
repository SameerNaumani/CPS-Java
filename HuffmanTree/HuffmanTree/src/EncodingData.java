public class EncodingData {

    private char symbol;
    private String encoding;
    
    public EncodingData( char symbol, String encoding) {
	this.symbol = symbol;
	this.encoding = encoding;
    }

    // Getter and setter methods for symbol
    public char getSymbol() {
	return symbol;
    }

    public void setSymbol(char s) {
	symbol = s;
    }
    
    //Getter and setter method for encoding
    public String getEncoding() {
	return encoding;
    }
    
    public void setEncoding(String e) {
	encoding = e;
    }
    
    // Determines if two EncodingData objects are equal based on the symbol
    public boolean equals(Object obj)
    {
	EncodingData other = (EncodingData) obj;
	if (symbol != other.getSymbol())
		return false;
	return true;
    }

    // @return String representation of the symbol and its Huffman code
    public String toString() {
	
	String s = "";
	s = "(" + Character.toString(symbol) + ", " +  //changes
        Integer.toString(symbol) + ")\n" ;
	return s;
    }
    
}

