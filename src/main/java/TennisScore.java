public class TennisScore {

    public int[] score = {0, 0};
    public int[] game = {0, 0};
    public String winner;
    public int[] set = {0, 0};

    public void getPoint(int i) {
        int opponent = i == 0 ? 1 : 0;
        if (score[0] == 3 && score[1] == 3) { // if deuce
            score[i] = 5;
        } else if (score[opponent] == 5) { // if AD to 40
            score[opponent] = 3;
        } else {
            if (score[i] < 3) { //under 40
                score[i]++;
            } else { //over 40 -> win
                score[i] = 0;
                game[i]++;
            }
        }
    }

    public String exchangePoint(int score) {
        //score state 0:0.1:15,2:30,3:40,4:win,5:AD
        String tennisScore = "0";
        if (score == 1)
            tennisScore = "15";
        else if (score == 2)
            tennisScore = "30";
        else if (score == 3) {
            tennisScore = "40";
        } else if (score == 5) {
            tennisScore = "AD";
        }
        return tennisScore;
    }

    public void getGame(int i) {
        game[i]++;
        if (game[i] == 3)
            winner = i == 0 ? "A" : "B";
    }

    public void getSet(int i) {
        int opponent = i == 0 ? 1 : 0;
        set[i]++;
        if (set[i] >= 6) {
            if (set[opponent] < 5) {// opponent's score < 5
                set[0] = 0;
                set[1] = 0;
                game[i]++;
            } else { //GET 7!
                if (set[i] == 7) { //if 6:5 or 6:6
                    set[0] = 0;
                    set[1] = 0;
                    game[i]++;
                }
            }
        }
    }
}
