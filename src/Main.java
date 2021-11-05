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
    	
    	//test Cavalier with shield against a Fantassin, the cavalier will always win
    	//the shield fully protect the cavalier
    	/*
    	Soldat c = new SoldatAvecBouclierDecorator(new Cavalier(100));
    	Soldat f = new Fantassin(1000);
    	int ncoups = 0;
        boolean vc = true;
        boolean vf = true;
        for (; (vf = f.parer(c.force())) && (vc = c.parer(f.force())); ncoups++)
            ;

        System.out.println("Mort du " + (vf ? "cavalier" : "fantassin")
                + " en " + ncoups + " coups");
                
        */
        /*
    	//test Cavalier with shield against a Fantassin with sword
    	Soldat c = new SoldatAvecBouclierDecorator(new SoldatAvecEpeeDecorator( new SoldatAvecBouclierDecorator(new Cavalier(10))));
    	Soldat f = new SoldatAvecEpeeDecorator(new Fantassin(10));
    	int ncoups = 0;
        boolean vc = true;
        boolean vf = true;
        for (; (vf = f.parer(c.force())) && (vc = c.parer(f.force())); ncoups++)
            ;

        System.out.println("Mort du " + (vf ? "cavalier" : "fantassin")
                + " en " + ncoups + " coups");
                
        */
    	
    	//testing Proxy
    	/*
    	ProxySoldat c = new ProxySoldat(new Cavalier(50));
    	ProxySoldat f = new ProxySoldat(new Fantassin(50));
    	f.addShield();
    	f.addSword();
    	int ncoups = 0;
        boolean vc = true;
        boolean vf = true;
        for (; (vf = f.parer(c.force())) && (vc = c.parer(f.force())); ncoups++)
            ;

        System.out.println("Mort du " + (vf ? "cavalier" : "fantassin")
                + " en " + ncoups + " coups");
              
        */
                
        
    	
    	
    	//testing composite
		/*
    	CompositeSoldat army1 = new CompositeSoldat();
    	army1.add(new Cavalier(5));
    	army1.add(new Cavalier(8));
    	
    	CompositeSoldat army2 = new CompositeSoldat();
    	army2.add(new Fantassin(50));
    	army2.add(new Fantassin(80));
    	
    	int ncoups = 0;
        boolean varmy2 = true;
        boolean varmy1 = true;
    	for (; (varmy1 = army1.parer(army2.force())) && (varmy2 = army2.parer(army1.force())); ncoups++)
            ;
    	
    	System.out.println("the size of the army1 : " + army1.getArmySize());

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

		ArmySoldierCounterVisitor counter = new ArmySoldierCounterVisitor();

		counter.visit(army1);




    	

    	
    	
    	
    }
    
}