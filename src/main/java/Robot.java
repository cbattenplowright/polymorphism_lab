import Interfaces.IMove;

public class Robot implements IMove {

    private String name;
    private String function;

    public Robot(String name, String function){
        this.name = name;
        this.function = function;
    }

    public String move(){
        return "Weee " + this.name + " is moving!";
    }

}
