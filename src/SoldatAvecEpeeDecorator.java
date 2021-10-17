
public class SoldatAvecEpeeDecorator extends SoldatDecorator {
	protected int swordQuality;

	public SoldatAvecEpeeDecorator(Soldat s) {

		super(s);
		this.swordQuality = 2;
	}

	@Override
	public int force() {

		int totalForce;
		if(this.swordQuality > 0){
			totalForce = this.decoratedSoldat.force() + 2;
			this.swordQuality--;
			System.out.println("the soldier uesd a sword to augment his force to  : " + totalForce);
		}else{
			System.out.println("sword is broken");
			totalForce = this.decoratedSoldat.force();
		}
		return totalForce; //we considered that a sword adds 2 to the force

		
	}

	@Override
	public boolean parer(int force) {
		return this.decoratedSoldat.parer(force);
	}

	public int getSwordQuality() {
		return swordQuality;
	}

	public void fixSword(){
		this.swordQuality = 20;
	}
}
