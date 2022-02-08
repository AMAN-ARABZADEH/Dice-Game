public class DiceGame {
    private Player player;
    private  Player player2;
    private Funktioner funktioner;


    public DiceGame(Player player, Player player2){
        this.player = player;
        this.player2 = player2;
        funktioner = new Funktioner();
    }


    public Player play(){
        int p1Rolls = player.play((funktioner));
        int p2Rolls = player2.play((funktioner));
        while (p1Rolls == p2Rolls){
            p1Rolls = player.play((funktioner));
            p2Rolls = player2.play((funktioner));
        }
        return (p1Rolls < p2Rolls) ? player : player2;
    }



}
