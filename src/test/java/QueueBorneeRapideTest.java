import com.fssm.classes.QueueBorneeRapide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueBorneeRapideTest {

    private QueueBorneeRapide queue;

    @BeforeEach
    public void setUp() {
        queue = new QueueBorneeRapide(5); // Initialize with capacity 5
    }

    @Test
    public void testAjouteElementQuandPleine() {
        // Adding elements to fill the queue
        queue.ajouteElement("Element 1");
        queue.ajouteElement("Element 2");
        queue.ajouteElement("Element 3");
        queue.ajouteElement("Element 4");
        queue.ajouteElement("Element 5");

        assertThrows(IllegalStateException.class, () -> {
            queue.ajouteElement("Element 6"); // Should throw exception when full
        });
    }

    @Test
    public void testEstPleine() {
        assertFalse(queue.estPleine()); // Initially not full
        queue.ajouteElement("Element 1");
        queue.ajouteElement("Element 2");
        queue.ajouteElement("Element 3");
        queue.ajouteElement("Element 4");
        queue.ajouteElement("Element 5");
        assertTrue(queue.estPleine()); // Should be full after adding 5 elements
    }

    @Test
    public void testRetireElementQuandVide() {
        assertThrows(IllegalStateException.class, () -> {
            queue.retireElement(); // Should throw exception when empty
        });
    }

    @Test
    public void testRetireElement() {
        queue.ajouteElement("Element 1");
        queue.ajouteElement("Element 2");
        queue.ajouteElement("Element 3");

        Object element = queue.retireElement();
        assertEquals("Element 1", element); // The first element should be removed

        assertEquals(2, queue.taille()); // The queue size should now be 2
    }

    @Test
    public void testEstVide() {
        assertTrue(queue.estVide()); // Initially empty
        queue.ajouteElement("Element 1");
        assertFalse(queue.estVide()); // Should be false after adding an element
    }

    @Test
    public void testTaille() {
        assertEquals(0, queue.taille()); // Initially size should be 0
        queue.ajouteElement("Element 1");
        assertEquals(1, queue.taille()); // After adding an element, size should be 1
    }
}
