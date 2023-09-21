package model;
public class ReverseSentence {
    private String sent;

    public ReverseSentence() {
        super();
    }

    public ReverseSentence(String sent) {
        super();
        this.sent = sent;
    }

    public String getSentence() {
        return sent;
    }

    public void setSentence(String sent) {
        this.sent = sent;
    }

    public String reverseSentence(String sent) {
        StringBuilder reversed = new StringBuilder();
        String[] words = sent.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a space unless it's the last word
            }
        }
        return reversed.toString();
    }

    public String getReverseSentence() {
        return reverseSentence(sent);
    }

    @Override
    public String toString() {
        return reverseSentence(sent);
    }
}
