public class Builder {
	
	private String name;

	//Defining the constructors
	public Builder (String name) {
		this.name = name;
	}

	//Supply the methods

	public String getName() {
		return this.name;
	}

	public String makeRow(int n, String s) {
		String row = "";
		for(int i = 1; i <= n; i++) {
			row = row + s;
		}
		return row;
	}

	public void makePyramid(int n, String s) {
		for(int j = 1; j <= n; j = j+2) {
			int k = (n-j)/2;
			System.out.println(makeRow(k,"_") + makeRow(j,s) + makeRow(k,"_"));
		}
	}
}