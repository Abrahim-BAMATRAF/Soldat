import java.util.ArrayList;

public class CompositeSoldat implements Soldat {
	
	private ArrayList<Soldat> army;
	
	public CompositeSoldat(){
		army = new ArrayList<Soldat>();
	}
	@Override
	public int force() {
		int totalForce = 0;
		for(int i =0; i < army.size(); i++){
			totalForce += army.get(i).force();
		}
		
		return totalForce;
	}

	@Override
	public boolean parer(int force) {
		int forceSep = force/army.size();
		forceSep = (forceSep == 0) ? 1 : forceSep;
		for(int i=0; i < army.size(); i++){
			boolean currentResult = army.get(i).parer(forceSep);
			if(!currentResult){
				//the soldier is dead, so we remove it from the army
				army.remove(i);
				i--;
			}
		}
		//return true if there is still some soldier alive
		return army.size()>0;
	}
	
	public void add(Soldat s){
		army.add(s);
	}
	
	public void remove(Soldat s){
		army.remove(s);
	}
	
	public int getArmySize(){
		return this.army.size();
	}

	public ArrayList<Soldat> getArmy(){
		return (ArrayList<Soldat>) this.army.clone();
	}

}
