import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TennisGameTest {
    @Test
    public void getGame_0to0_Aget_return1to0(){
        TennisScore ts = new TennisScore();
        ts.getGame(0);
        int expectedGame = 1;
        int actualGame = ts.game[0];
        assertEquals(expectedGame,actualGame);
    }

    @Test
    public void getGame_2to1_Bget_return2to2(){
        TennisScore ts = new TennisScore();
        ts.game[0] = 2;
        ts.game[1] = 1;
        ts.getGame(1);
        int expectedGame = 2;
        int actualGame = ts.game[1];
        assertEquals(expectedGame,actualGame);
    }

    @Test
    public void getGame_2to2_Aget_returnAwin(){
        TennisScore ts = new TennisScore();
        ts.game[0] = 2;
        ts.game[1] = 2;
        ts.getGame(0);
        String expectedWinner = "A";
        String actualWinner = ts.winner;
        assertEquals(expectedWinner,actualWinner);
    }

    @Test
    public void getGame_2to2_Bget_returnBwin(){
        TennisScore ts = new TennisScore();
        ts.game[0] = 2;
        ts.game[1] = 2;
        ts.getGame(1);
        String expectedWinner = "B";
        String actualWinner = ts.winner;
        assertEquals(expectedWinner,actualWinner);
    }

    @Test
    public void getGame_2to1_Aget_returnAwin(){
        TennisScore ts = new TennisScore();
        ts.game[0] = 2;
        ts.game[1] = 1;
        ts.getGame(0);
        String expectedWinner = "A";
        String actualWinner = ts.winner;
        assertEquals(expectedWinner,actualWinner);
    }
}
