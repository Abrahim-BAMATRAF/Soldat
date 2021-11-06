
import static org.junit.Assert.*;

import org.junit.Test;

public class testComposite {
	
	@Test
	public final void addingASoldier(){
		CompositeSoldat army1 = new CompositeSoldat();
    	army1.add(new Cavalier(5));
    	
    	assertTrue(army1.getArmySize() == 1);
    	
	}
	
	@Test
	public final void deletingDeadSoldier(){
    	CompositeSoldat army1 = new CompositeSoldat();
    	army1.add(new Cavalier(5));
    	army1.add(new Cavalier(8));
    	
    	CompositeSoldat army2 = new CompositeSoldat();
    	army2.add(new Fantassin(50));
    	army2.add(new Fantassin(80));
    	
    	boolean varmy2 = true;
        boolean varmy1 = true;
        
    	for (; (varmy1 = army1.parer(army2.force())) && (varmy2 = army2.parer(army1.force()));)
            ;
    	
    	assertTrue(army1.getArmySize() == 0);
	}
	
	@Test
	public final void armyFource(){
		CompositeSoldat army1 = new CompositeSoldat();
    	army1.add(new Cavalier(5));
    	army1.add(new Cavalier(8));
    	
    	assertTrue(army1.force() == 4);
		
	}

	@Test
	public final void addingSwords(){
		CompositeSoldat army1 = new CompositeSoldat();
		army1.add(new Cavalier(5));
		army1.add(new Cavalier(8));

		CompositeSoldat army2 = new CompositeSoldat();
		army2.add(new Cavalier(5));
		army2.add(new Cavalier(8));

		army2.addSword();

		boolean varmy2 = true;
		boolean varmy1 = true;

		for (; (varmy1 = army1.parer(army2.force())) && (varmy2 = army2.parer(army1.force()));)
			;

		assertTrue(army1.getArmySize() == 0);

	}

	@Test
	public final void addingShields(){
		CompositeSoldat army1 = new CompositeSoldat();
		army1.add(new Cavalier(5));

		CompositeSoldat army2 = new CompositeSoldat();
		army2.add(new Cavalier(5));

		army2.addShield();

		boolean varmy2 = true;
		boolean varmy1 = true;

		for (; (varmy1 = army1.parer(army2.force())) && (varmy2 = army2.parer(army1.force()));)
			;

		assertTrue(army1.getArmySize() == 0);

	}

}
