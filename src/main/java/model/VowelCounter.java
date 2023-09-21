package model;
public class VowelCounter {
    private String sent2;

    public VowelCounter() {
        super();
    }

    public VowelCounter(String sent2) {
        super();
        this.sent2 = sent2;
    }

    public String getSentence2() {
        return sent2;
    }

    public void setSentence2(String sent2) {
        this.sent2 = sent2;
    }

    public String vowelCounter(String sent2) {
    	 StringBuilder counter = new StringBuilder();
    	    String[] words = sent2.split("\\s+");
    	    for (int i = 0; i < words.length; i++) {
    	        int vowelCount = words[i].replaceAll("(?i)[^aeiou]", "").length();
    	        counter.append("Word #").append(i + 1).append(" [").append(words[i])
    	                .append("] contains ").append(vowelCount).append(" vowels.<br>");
    	    }
    	    return counter.toString();
    	}
    
    public String getvowelCounter() {
        return vowelCounter(sent2);
    }

    @Override
    public String toString() {
        return vowelCounter(sent2);
    }
}
