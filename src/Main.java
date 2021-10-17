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
    	
    }
    
}