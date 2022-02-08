public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Aman");
        Player p2 = new Player("Linnea");
        DiceGame game = new DiceGame(p1, p2);
        Player winner = game.play();
        System.out.println(winner.getName() + " vann spelet.");



    }
}
