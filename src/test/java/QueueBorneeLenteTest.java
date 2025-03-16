import com.fssm.classes.QueueBorneeLente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueBorneeLenteTest {

    @Test
    public void testAjouteElement() {
        QueueBorneeLente queue = new QueueBorneeLente(3);
        queue.ajouteElement(1);
        queue.ajouteElement(2);
        queue.ajouteElement(3);

        assertTrue(queue.estPleine(), "The queue should be full after adding 3 elements");
    }

    @Test
    public void testSupprimeElement() {
        QueueBorneeLente queue = new QueueBorneeLente(3);
        queue.ajouteElement(1);
        queue.ajouteElement(2);

        assertEquals(1, queue.supprimeElement(), "The first element should be 1");
        assertEquals(2, queue.supprimeElement(), "The second element should be 2");
    }

    @Test
    public void testEstPleine() {
        QueueBorneeLente queue = new QueueBorneeLente(3);
        queue.ajouteElement(1);
        queue.ajouteElement(2);
        queue.ajouteElement(3);

        assertTrue(queue.estPleine(), "The queue should be full after adding 3 elements");
    }

    @Test
    public void testEstVide() {
        QueueBorneeLente queue = new QueueBorneeLente(3);

        assertTrue(queue.estVide(), "The queue should be empty initially");

        queue.ajouteElement(1);
        queue.supprimeElement();

        assertTrue(queue.estVide(), "The queue should be empty after adding and removing an element");
    }

    @Test
    public void testSupprimeElementQuandVide() {
        QueueBorneeLente queue = new QueueBorneeLente(3);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            queue.supprimeElement();
        });

        assertEquals("Queue is empty", exception.getMessage());
    }

    @Test
    public void testAjouteElementQuandPleine() {
        QueueBorneeLente queue = new QueueBorneeLente(3);
        queue.ajouteElement(1);
        queue.ajouteElement(2);
        queue.ajouteElement(3);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            queue.ajouteElement(4);
        });

        assertEquals("Queue is full", exception.getMessage());
    }
}
