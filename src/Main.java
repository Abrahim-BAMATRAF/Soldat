public class Main {

    public static void main(String[] args) {
    	/*
        Soldat c = new Cavalier(100);
        Soldat f = new Fantassin(50);
        int ncoups = 0;
        boolean vc = true;
        boolean vf = true;

        for (; (vf = f.parer(c.force())) && (vc = c.parer(f.force())); ncoups++)
            ;

        System.out.println("Mort du " + (vf ? "cavalier" : "fantassin")
                + " en " + ncoups + " coups");
        */


		//testing ArmySoldiersPrintVisitor
		/*
		CompositeSoldat army1 = new CompositeSoldat();
		army1.add(new ProxySoldat(new Cavalier(50)));
		army1.add(new Cavalier(8));

		ArmySoldiersPrintVisitor printer = new ArmySoldiersPrintVisitor();

		printer.visit(army1);

		 */

		//testing ArmySoldierCounterVisitor
		CompositeSoldat army1 = new CompositeSoldat();
		army1.add(new Cavalier(50));
		army1.add(new Cavalier(8));
		army1.add(new ProxySoldat(new Cavalier(8)));


		ArmySoldierCounterVisitor counter = new ArmySoldierCounterVisitor();

		counter.visit(army1);

    	
    }
    
}