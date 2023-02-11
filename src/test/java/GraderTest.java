import junit.framework.TestCase;

public class GraderTest extends TestCase {



    public void testDetermineLetterGradeReturnF() {
        // arrange
        var grader = new Grader();
        // assert
        assertEquals('F',grader.determineLetterGrade(57));
    }

    public void testDetermineLetterGradeReturnA(){
        // arrange
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(98));
    }
}