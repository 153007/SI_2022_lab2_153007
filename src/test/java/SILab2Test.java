import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void everyStatement() {
        //map setup
        List<String> everyMap = List.of("0", "#", "#", "#", "#", "0", "#", "0", "#", "#", "#", "0", "0", "#", "0", "#");
        List<String> everyCorrect = List.of("2", "#", "#", "#", "#", "4", "#", "2", "#", "#", "#", "2", "2", "#", "3", "#");

        //tests
        IllegalArgumentException er;
        er = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(er.getMessage().contains("List length should be greater than 0"));

        er = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "#", "0")));
        assertTrue(er.getMessage().contains("List length should be a perfect square"));

        assertEquals(everyCorrect, SILab2.function(everyMap));
    }

    @Test
    public void everyBranch() {
        //map setup
        List<String> everyMap = List.of("0", "#", "#", "#", "#", "0", "#", "0", "#", "#", "#", "0", "0", "#", "0", "#");
        List<String> everyCorrect = List.of("2", "#", "#", "#", "#", "4", "#", "2", "#", "#", "#", "2", "2", "#", "3", "#");

        //tests
        IllegalArgumentException er;
        er = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(er.getMessage().contains("List length should be greater than 0"));

        er = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "#", "0")));
        assertTrue(er.getMessage().contains("List length should be a perfect square"));

        assertEquals(everyCorrect, SILab2.function(everyMap));
    }
}
