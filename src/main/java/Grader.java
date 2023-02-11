public class Grader {
    public char determineLetterGrade(int numGrade){
        if(numGrade <0){
            throw new IllegalArgumentException("Number Grade Cannot be Negative");
        }else if(numGrade < 60){
            return 'F';
        } else if (numGrade < 70) {
            return 'D';
        } else if (numGrade<80) {
            return 'C';
        }else if(numGrade<90){
            return 'B';
        }else {
            return 'A';
        }
    }
}
