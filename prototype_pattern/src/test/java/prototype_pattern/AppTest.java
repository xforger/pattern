package prototype_pattern;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import prototype_pattern.model.FieldNotes;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void prototypeTest(){
        FieldNotes fieldNotes = new FieldNotes();
        System.out.println(fieldNotes.getCome_on_time());
        FieldNotes fieldNotes1 = (FieldNotes) fieldNotes.shawllowClone();
        System.out.println(fieldNotes.getCome_on_time()==fieldNotes1.getCome_on_time());
        try {
            FieldNotes fieldNotes2=(FieldNotes) fieldNotes.clone();
            System.out.println(fieldNotes.getCome_on_time()==fieldNotes2.getCome_on_time());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
