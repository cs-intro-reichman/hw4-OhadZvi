public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the keywords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] lowSentences = new String[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            lowSentences[i] = MyString.lowerCase(sentences[i]);
        }
        String[] lowKeywords = new String[keywords.length];
        for (int i = 0; i < keywords.length; i++) {
            lowKeywords[i] = MyString.lowerCase(keywords[i]);
        }
        for (int i = 0; i < lowSentences.length; i++) {
            for (int j = 0; j < lowKeywords.length; j++) {
                 int wordIndex = (lowSentences[i].indexOf(lowKeywords[j]));
                if (wordIndex != -1) {
                    System.out.println(sentences[i]);
                    break;
                }
            }
        }
    }
}
