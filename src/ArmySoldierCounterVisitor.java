import java.util.ArrayList;

/**
 * precondition : the soldier added to the army must be of the type Cavalier or Fantassin not ProxySoldier
 */
public class ArmySoldierCounterVisitor implements ArmyVisitor {
    @Override
    public void visit(CompositeSoldat army) {
        ArrayList<Soldat> list = army.getArmy();
        int nbCavalier = 0;
        int nbFantassin = 0;

        for(int i =0; i < list.size(); i++){
            if(list.get(i) instanceof Cavalier){
                nbCavalier++;
            }else if (list.get(i) instanceof Fantassin){
                nbFantassin++;
            }else {
                Cavalier s = new Cavalier(5);
                Fantassin f = new Fantassin(5);
                if(list.get(i).getClass().getSuperclass().isInstance(s)){
                    nbCavalier++;
                }

                if(list.get(i).getClass().getSuperclass().isInstance(f)){
                    nbFantassin++;
                }
            }
        }

        System.out.println("the number of cavalier is : " + nbCavalier + " \n and the number of fantassin is : " + nbFantassin);
    }
}


