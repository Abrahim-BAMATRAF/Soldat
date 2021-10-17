
public class SoldatAvecBouclierDecorator extends SoldatDecorator {
	protected int swordQuality;

	public SoldatAvecBouclierDecorator(Soldat s) {
		super(s);
		this.swordQuality = 20;
	}

	@Override
	public int force() {
		return this.decoratedSoldat.force();
	}

	@Override
	public boolean parer(int force) {
		int totalForce;
		totalForce = (this.swordQuality > 0)? force -1 : force;
		
		boolean res = this.decoratedSoldat.parer(totalForce);
    	System.out.println("the soldier used a shield to lower the force of the attack from : " + force + " to : " + totalForce);
		return res; //we considered that a shield takes 1 from the force
	}
	
	public int getShieldQuality(){
		return this.swordQuality;
	}
	
	public void fixShield(){
		this.swordQuality = 20;
	}

}
