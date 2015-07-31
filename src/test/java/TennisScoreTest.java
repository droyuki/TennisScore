import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by WeiChen on 2015/7/31.
 */

public class TennisScoreTest {
    @Test
    public void addPoint_0to0_Aget_return15to0 (){
        TennisScore ts = new TennisScore();
        ts.getPoint(0);
        String actualScoreA = ts.exchangePoint(ts.score[0]);
        String expectedScoreA = "15";
        assertEquals(expectedScoreA, actualScoreA);
    }

    @Test
    public void addPoint_40to0_Aget_returnAwin0to0(){
        TennisScore ts = new TennisScore();
        ts.score[0] = 3;
        ts.getPoint(0);
        assertEquals(ts.exchangePoint(ts.score[0]), "0");
        assertEquals(1, ts.game[0]);
    }

    @Test
    public void addPoint_40to40_Aget_returnADto40(){
        TennisScore ts = new TennisScore();
        ts.score[0] = 3;
        ts.score[1] = 3;
        ts.getPoint(0);
        String expectedScoreA = "AD";
        String actualScoreA = ts.exchangePoint(ts.score[0]);
        assertEquals(expectedScoreA, actualScoreA);
    }

    @Test
    public void addPoint_ADto40_Aget_returnAwin0to0(){
        TennisScore ts = new TennisScore();
        ts.score[0] = 5;
        ts.score[1] = 3;
        ts.getPoint(0);
        String expectedScoreA = "0";
        String actualScoreA = ts.exchangePoint(ts.score[0]);
        assertEquals(expectedScoreA,actualScoreA);
    }

    @Test
    public void addPoint_ADto40_Bget_return40to40(){
        TennisScore ts = new TennisScore();
        ts.score[0] = 5;
        ts.score[1] = 3;
        ts.getPoint(1);
        String expectedScoreA = "40";
        String actualScoreA = ts.exchangePoint(ts.score[0]);
        assertEquals(expectedScoreA,actualScoreA);
    }

    @Test
    public void addPoint_40to40_Bget_return40toAD(){
        TennisScore ts = new TennisScore();
        ts.score[0] = 3;
        ts.score[1] = 3;
        ts.getPoint(1);
        String expectedScore = "AD";
        String actualScore = ts.exchangePoint(ts.score[1]);
        assertEquals(expectedScore,actualScore);
    }
}

