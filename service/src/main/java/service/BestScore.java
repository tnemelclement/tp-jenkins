package service;


public class BestScore {
    private int lastScore = 0;
    private int newScore = 0;
    private int bestScore = 0;

    public String dispResult() {
        return "Votre dernier score est " + lastScore + " votre nouveau score est " + newScore + " et les meilleur score est " + bestScore;
    }

     public void update(int newSc) {
        this.lastScore = this.newScore;
        this.newScore = newSc;
        if (newSc > bestScore) bestScore = newSc;
     }
}
