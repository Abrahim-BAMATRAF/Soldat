import java.util.ArrayList;

public class ArmySoldiersPrintVisitor implements ArmyVisitor {

    @Override
    public void visit(CompositeSoldat army) {
        ArrayList<Soldat> list = army.getArmy();
        for(int i = 0; i < list.size(); i++){
           System.out.println("the soldier number : " + i + "  has force of : " + list.get(i).force() + " . \n");
        }
    }
}
