import com.fssm.classes.QueueBorneeInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueBorneeIntegerTest {

    private QueueBorneeInteger queue;

    @BeforeEach
    void setUp() {
        queue = new QueueBorneeInteger(3);
    }

    @Test
    void testAjouteElement() {
        assertEquals(1, queue.ajouteElement(1));
        assertEquals(2, queue.ajouteElement(2));
        assertEquals(3, queue.ajouteElement(3));
    }

    @Test
    void testAjouteElementQuandPleine() {
        queue.ajouteElement(1);
        queue.ajouteElement(2);
        queue.ajouteElement(3);
        assertThrows(IllegalArgumentException.class, () -> queue.ajouteElement(4));
    }

    @Test
    void testSupprimeElement() {
        queue.ajouteElement(1);
        queue.ajouteElement(2);
        assertEquals(1, queue.supprimeElement());
        assertEquals(2, queue.supprimeElement());
    }

    @Test
    void testSupprimeElementQuandVide() {
        assertThrows(IllegalArgumentException.class, () -> queue.supprimeElement());
    }

    @Test
    void testEstVide() {
        assertTrue(queue.estVide());
        queue.ajouteElement(1);
        assertFalse(queue.estVide());
    }

    @Test
    void testEstPleine() {
        assertFalse(queue.estPleine());
        queue.ajouteElement(1);
        queue.ajouteElement(2);
        queue.ajouteElement(3);
        assertTrue(queue.estPleine());
    }

    @Test
    void testTaille() {
        assertEquals(0, queue.taille());
        queue.ajouteElement(1);
        queue.ajouteElement(2);
        assertEquals(2, queue.taille());
    }
}
