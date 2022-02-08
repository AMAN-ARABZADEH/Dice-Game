public class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }

    public int play(Funktioner funktioner){
        funktioner.roll();
        int prevResult = funktioner.getResult();
        funktioner.roll();
        int result = funktioner.getResult();
        int nbrRolls = 2;
        while (result != prevResult){
            funktioner.roll();
            nbrRolls = nbrRolls +1;
            prevResult = result;
            result = funktioner.getResult();
        }
        return nbrRolls;
    }

    public String getName(){
        return name;
    }



}
