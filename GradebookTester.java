import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	
	GradeBook gradeBook1, gradeBook2;
	
	@BeforeEach
	void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		
		gradeBook1.addScore(12);
		gradeBook1.addScore(32);
		gradeBook2.addScore(56);
		gradeBook2.addScore(87);
		gradeBook2.addScore(15);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(gradeBook1.toString().equals("12.0 32.0"));
		assertTrue(gradeBook2.toString().equals("56.0 87.0 15.0"));
	}
	
	@Test
	public void testSum() {
		assertEquals(44, gradeBook1.sum(), .0001);
		assertEquals(158, gradeBook2.sum(), .0001);
	}
	
	@Test
	public void testMinimum() {
		assertEquals(12, gradeBook1.minimum(), .001);
		assertEquals(15, gradeBook2.minimum(), .001);
	}
	
	@Test
	public void testFinalScore() {
		assertEquals(20, gradeBook1.finalScore(), .0001);
		assertEquals(143, gradeBook2.finalScore(), .0001);
	}

}
