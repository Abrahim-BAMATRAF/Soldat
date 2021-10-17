public class Fantassin extends SoldatAbstrait {
    private static final int FORCE_FANTASSIN = 1;

    public Fantassin(int vie) {
        super(vie);
    }

    public int force() {
		System.out.println("the force of the Fantassin is : " + FORCE_FANTASSIN);
        return FORCE_FANTASSIN;
    }
}