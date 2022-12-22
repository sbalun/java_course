package FinalExam;

public class Player {
    private String name;
    private String guess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public Player (){
        this.name = "no name given";
    }

    public Player(String name) {
        this.name = name;
    }
}
