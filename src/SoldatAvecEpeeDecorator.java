
public class SoldatAvecEpeeDecorator extends SoldatDecorator {

	public SoldatAvecEpeeDecorator(Soldat s) {
		super(s);
	}

	@Override
	public int force() {

		int totalForce = this.decoratedSoldat.force() + 2;
		System.out.println("the soldier uesd a sword to augment his force to  : " + totalForce);
		return totalForce; //we considered that a sword adds 2 to the force

		
	}

	@Override
	public boolean parer(int force) {
		return this.decoratedSoldat.parer(force);
	}

}
