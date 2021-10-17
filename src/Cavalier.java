public class Cavalier extends SoldatAbstrait {
    private static final int FORCE_CAVALIER = 2;

    public Cavalier(int vie) {
        super(vie);
    }

    public int force() {
		System.out.println("the force of the Cavalier is : " + FORCE_CAVALIER);
        return FORCE_CAVALIER;
    }
}