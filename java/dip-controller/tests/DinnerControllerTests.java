import junit.framework.TestCase;

public class DinnerControllerTests extends TestCase {

	public void testSinAlimentar() {
        // arrange
		DinnersController dinnersController = new DinnersController();
        
        // assert
    	assertEquals("cumplea�os", dinnersController.getById(1).Name);
    }
}