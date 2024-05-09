package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import util.MisArrays.MedianaNotas.MediaNotas;

public class MediaNotasTest {

    @Test
    public void testMediaNotas() {
        assertEquals(6, MediaNotas.mediaNotas(new int[] { 10, 5, 8, 6, 9 }), 0.01);
        assertEquals(4, MediaNotas.mediaNotas(new int[] { 1, 2, 3, 4, 5 }), 0.01);
    }

}