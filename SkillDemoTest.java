import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multi() {
        assertEquals(10, SkillDemo.multiplication(2, 5)); // Fails
    }
}
