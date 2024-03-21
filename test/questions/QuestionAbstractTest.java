package questions;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QuestionAbstractTest {
    /**
     * test the TrueFalse question's order
     */
    @Test
    public void testCompareToTrueFalseBeforeMultipleChoice() {
        QuestionAbstract trueFalseQuestion = new TrueFalse("Is the sky blue?", "True");

        QuestionAbstract multipleChoiceQuestion = new MultipleChoice("Choose the correct option:", "1", new String[]{"1", "2", "3"});

        int result = trueFalseQuestion.compareTo(multipleChoiceQuestion);

        assertEquals(-1, result);
    }

    /**
     * test the MultipleChoice question's order
     */
    @Test
    public void testCompareToMultipleChoiceBeforeMultipleSelect() {
        QuestionAbstract multipleChoiceQuestion = new MultipleChoice("Choose the correct option:", "1", new String[]{"1", "2", "3"});

        QuestionAbstract multipleSelectQuestion = new MultipleSelect("Select all correct options:", new String[]{"1", "2"}, new String[]{"1", "2", "3", "4"});

        int result = multipleChoiceQuestion.compareTo(multipleSelectQuestion);

        assertEquals(-1, result);
    }

    /**
     * test the MultipleSelect question's order
     */
    @Test
    public void testCompareToMultipleSelectBeforeLikert() {
        QuestionAbstract multipleSelectQuestion = new MultipleSelect("Select all correct options:", new String[]{"1", "2"}, new String[]{"1", "2", "3", "4"});

        QuestionAbstract likertQuestion = new Likert("Rate your satisfaction:");

        int result = multipleSelectQuestion.compareTo(likertQuestion);

        assertEquals(-1, result);
    }

    /**
     *
     */
    @Test
    public void testCompareToSameQuestionTypeLexicographicalOrder() {
        QuestionAbstract likertQuestion1 = new Likert("Rate your satisfaction:");
        QuestionAbstract likertQuestion2 = new Likert("Rate your happiness:");

        int result = likertQuestion2.compareTo(likertQuestion1);

        assertEquals("Rate your happiness:".compareTo("Rate your satisfaction:"), result);
    }
}
