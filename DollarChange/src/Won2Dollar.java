
public class Won2Dollar extends Concert{
	public Won2Dollar() {
		ratio= 1200;
	}
	
	
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getScrString() {
		return "won";
	}
	protected String getDestString() {
		return "dollar";
	}


	protected String srcString() {
		// TODO Auto-generated method stub
		return null;
	}


	protected String destString() {
		// TODO Auto-generated method stub
		return null;
	}

}
