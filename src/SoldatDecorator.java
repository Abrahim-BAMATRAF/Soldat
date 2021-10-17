
abstract class SoldatDecorator implements Soldat  {
	
	protected Soldat decoratedSoldat; 
	
	public SoldatDecorator(Soldat s){
		this.decoratedSoldat = s;
	}

}
