
public class ProxySoldat implements Soldat {
	public Soldat soldat;
	private boolean hasSword;
	private boolean hasShield;
	
	public ProxySoldat(Soldat s){
		this.soldat = s;
		this.hasSword = false;
		this.hasShield = false;
	}

	@Override
	public int force() {
		return soldat.force();
	}

	@Override
	public boolean parer(int force) {
		return soldat.parer(force);
	}
	
	public void addSword(){
		if(!this.hasSword){
			this.soldat = new SoldatAvecEpeeDecorator(this.soldat);
			this.hasSword = true;
		}
	}

	public void addShield(){
		if(!this.hasShield){
			this.soldat = new SoldatAvecBouclierDecorator(this.soldat);
			this.hasShield = true;
		}
	}
	

}
