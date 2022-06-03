public class Sports {
    private int games;
    private String team;
    private int wins;
    private int losses;

    public Sports(String team) {
        this.games = 0;
        this.wins = 0;
        this.losses = 0;
        this.team = team;
    }

    public int getGames() { return this.games; }
    public int getWins() { return this.wins; }
    public int getLosses() { return this.losses; }
    public String name() { return this.name(); }


    public void win() { this.wins++; }
    public void losses() { this.losses++; }
    public void games() { this.games++; }



}

