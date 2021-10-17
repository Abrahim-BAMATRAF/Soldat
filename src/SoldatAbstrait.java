abstract class SoldatAbstrait implements Soldat {
    protected int vie;

    SoldatAbstrait(int vie) {
        this.vie = vie;
    }

    public boolean parer(int force) {
    	System.out.println("the soldier was attacked with force of : " + force);
        vie = (vie > force) ? vie - force : 0;
        return vie > 0;
    }
}