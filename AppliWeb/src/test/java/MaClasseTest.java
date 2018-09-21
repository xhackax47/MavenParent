import static org.junit.Assert.assertEquals;

import org.junit.Test;

import test.MaClasse;

public class MaClasseTest {

@Test
  public void testCalculer() throws Exception {

    assertEquals(2,MaClasse.calculer(1,1));
  }
}