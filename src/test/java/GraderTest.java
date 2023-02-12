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

    public void testDetermineLetterGradeReturnB(){
        // arrange
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(88));
    }

    public void testDetermineLetterGradeReturnC(){
        // arrange
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(78));
    }

    public void testDetermineLetterGradeReturnIllegalArgumentException(){
        // arrange
        var grader = new Grader();


    }
}