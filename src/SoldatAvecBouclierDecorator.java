
public class SoldatAvecBouclierDecorator extends SoldatDecorator {
	protected int shieldQuality;

	public SoldatAvecBouclierDecorator(Soldat s) {
		super(s);
		this.shieldQuality = 2;
	}

	@Override
	public int force() {
		return this.decoratedSoldat.force();
	}

	@Override
	public boolean parer(int force) {
		int totalForce;
		//we considered that a shield takes 1 from the force
		if(this.shieldQuality > 0){
			totalForce =  force -1;
			this.shieldQuality--;
			System.out.println("the soldier used a shield to lower the force of the attack from : " + force + " to : " + totalForce);
		}else{
			totalForce = force;
			System.out.println("Shield is broken");
		}
		boolean res = this.decoratedSoldat.parer(totalForce);
		return res;
	}
	
	public int getShieldQuality(){
		return this.shieldQuality;
	}
	
	public void fixShield(){
		this.shieldQuality = 20;
	}

}
