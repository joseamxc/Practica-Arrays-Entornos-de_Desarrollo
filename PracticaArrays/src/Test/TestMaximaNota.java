package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import util.MisArrays.MaximaNota;

public class TestMaximaNota {

    @Test
    public void testMaximaNota() {
        assertEquals(10, MaximaNota.maximaNota(new int[] { 10, 5, 8, 6, 9 }));
      
       assertEquals(-1, MaximaNota.maximaNota(new int[] { -1, 1, 2, 3, 4 }));
    }

}
