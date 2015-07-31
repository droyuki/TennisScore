import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by WeiChen on 2015/7/31.
 */
public class TennisSetTest {
    @Test
    public void getSet_0to0_Aget_return1to0(){
        TennisScore ts = new TennisScore();
        ts.getSet(0);
        int expectedSet = 1;
        int actualSet = ts.set[0];
        assertEquals(expectedSet,actualSet);
    }

    @Test
    public void getSet_6to5_Aget_return0to0AgetGame(){
        TennisScore ts = new TennisScore();
        ts.set[0] = 6;
        ts.set[1] = 5;
        ts.getSet(0);
        int expectedSet = 0;
        int actualSet = ts.set[0];
        int expectedGame = 1;
        int actualGame = ts.game[0];
        assertEquals(expectedSet,actualSet);
        assertEquals(expectedGame,actualGame);
    }

    @Test
    public void getSet_5to6_Bget_return0to0BgetGame(){
        TennisScore ts = new TennisScore();
        ts.set[0] = 5;
        ts.set[1] = 6;
        ts.getSet(1);
        int expectedSet = 0;
        int actualSet = ts.set[0];
        int expectedGame = 1;
        int actualGame = ts.game[1];
        assertEquals(expectedSet,actualSet);
        assertEquals(expectedGame,actualGame);
    }

    @Test
    public void getSet_2to5_Bget_return0to0BgetGame(){
        TennisScore ts = new TennisScore();
        ts.set[0] = 2;
        ts.set[1] = 5;
        ts.getSet(1);
        int expectedSet = 0;
        int actualSet = ts.set[1];
        int expectedGame = 1;
        int actualGame = ts.game[1];
        assertEquals(expectedSet,actualSet);
        assertEquals(expectedGame,actualGame);
    }

    @Test
    public void getSet_3o4_Aget_return4to4(){
        TennisScore ts = new TennisScore();
        ts.set[0] = 3;
        ts.set[1] = 4;
        ts.getSet(0);
        int expectedSet = 4;
        int actualSet = ts.set[0];
        assertEquals(expectedSet,actualSet);
    }

    @Test
    public void getSet_6to6_Aget_return0to0AgetGame(){
        TennisScore ts = new TennisScore();
        ts.set[0] = 6;
        ts.set[1] = 6;
        ts.getSet(0);
        int expectedSet = 0;
        int actualSet = ts.set[0];
        int expectedGame = 1;
        int actualGame = ts.game[0];
        assertEquals(expectedSet,actualSet);
        assertEquals(expectedGame,actualGame);
    }

    @Test
    public void getSet_4to5_Bget_return0to0BgetGame(){
        TennisScore ts = new TennisScore();
        ts.set[0] = 4;
        ts.set[1] = 5;
        ts.getSet(1);
        int expectedSet = 0;
        int actualSet = ts.set[0];
        int expectedGame = 1;
        int actualGame = ts.game[1];
        assertEquals(expectedSet,actualSet);
        assertEquals(expectedGame,actualGame);
    }

    @Test
    public void getSet_2to5_Aget_return3to5(){
        TennisScore ts = new TennisScore();
        ts.set[0] = 2;
        ts.set[1] = 5;
        ts.getSet(0);
        int expectedSet = 3;
        int actualSet = ts.set[0];
        assertEquals(expectedSet,actualSet);
    }

}
