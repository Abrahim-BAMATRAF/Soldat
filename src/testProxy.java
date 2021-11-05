import static org.junit.Assert.*;

import org.junit.Test;

public class testProxy {

	@Test
	public final void addingASword() {
    	ProxySoldat soldier1 = new ProxySoldat(new Cavalier(50));
    	ProxySoldat soldier2 = new ProxySoldat(new Cavalier(50));

    	soldier1.addSword();
    	
    	assertTrue(soldier1.force() > soldier2.force());

		
	}
	
	@Test
	public final void addingAShield(){
		ProxySoldat soldier1 = new ProxySoldat(new Cavalier(50));
    	ProxySoldat soldier2 = new ProxySoldat(new Cavalier(50));

    	soldier1.addShield();
    	
    	
    	int ncoups = 0;
        boolean vsoldier1 = true;
        boolean vsoldier2 = true;
        
        for (; (vsoldier1 = soldier1.parer(soldier2.force())) && (vsoldier2 = soldier2.parer(soldier1.force())); ncoups++)
            ;
    	
    	assertTrue(vsoldier1);
		
	}
	@Test
	public final void addingTwoSword() {
    	ProxySoldat soldier1 = new ProxySoldat(new Cavalier(50));
    	ProxySoldat soldier2 = new ProxySoldat(new Cavalier(50));

    	soldier1.addSword();
    	soldier1.addSword();
    	
    	soldier2.addSword();
    	
    	assertTrue(soldier1.force() == soldier2.force());

		
	}
	
	

}
