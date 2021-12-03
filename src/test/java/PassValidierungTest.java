import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassValidierungTest {
    @Test
    void langGenugTest(){
        assertTrue(PassValidierung.istLang(9));
    }

    @Test
    void langNichtTest(){
        assertFalse(PassValidierung.istLang(5));
    }

    @Test
    void zahlenTest(){
        assertTrue(PassValidierung.istZahlen("saldam12121"));
    }

    @Test
    void keinZahlenTest(){
        assertFalse(PassValidierung.istZahlen("adsaldsamldsa"));
    }

}

