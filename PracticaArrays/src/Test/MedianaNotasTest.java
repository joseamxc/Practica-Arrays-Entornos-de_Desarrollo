package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import util.MisArrays.MedianaNotas;

public class MedianaNotasTest {

    @Test
    public void testMedianaNotas() {
        assertEquals(6, MedianaNotas.medianaNotas(new int[] { 10, 5, 8, 6, 9 }), 0.01);
 
        assertEquals(4, MedianaNotas.medianaNotas(new int[] { 1, 2, 3, 4, 5 }), 0.01);
    }

}
