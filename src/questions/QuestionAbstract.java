package questions;

public abstract class QuestionAbstract implements Question {
    public final String text;
    public QuestionAbstract(String text) {
        this.text = text;
    }
    @Override
    public String answer(String answer) {
        return "Correct";
    }

    @Override
    public String getText() {
        return text;
    }

    /**
     * Provide order function of questions
     * @param o the object to be compared.
     * @return the order
     */
    public int compareTo(Question o) {
        if(this instanceof TrueFalse && !(o instanceof TrueFalse)) {
            return -1;
        }else if(this instanceof MultipleChoice && !(o instanceof TrueFalse || o instanceof MultipleChoice)) {
            return -1;
        }else if(this instanceof MultipleSelect && !(o instanceof TrueFalse || o instanceof MultipleChoice || o instanceof MultipleSelect)) {
            return -1;
        }else if(this instanceof Likert && !(o instanceof Likert)){
            return 1;
        }else if (this.getClass().equals(o.getClass())) {
            return this.text.compareTo(o.getText());
        }
        return 0;
    }
}
