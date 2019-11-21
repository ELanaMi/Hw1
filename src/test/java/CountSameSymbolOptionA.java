import org.junit.jupiter.api.Test;

public class CountSameSymbolOptionA {

    public Integer countSameSymbol(String text, String symbol) {
        Integer foundedSymbols = 0;

        if (text.contains(symbol)) {

            for (int counter = 0; counter < text.length(); counter++) {
                if (symbol.equals(text.substring(counter, counter+1))) {
                    foundedSymbols++;
                }
            }
            return foundedSymbols;

        } else {
            return foundedSymbols;
        }
    }

    @Test
    public void countSameSymbolTest() {
        String fishText = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.";
        String abcdText = "abcdefghijklmnopqrstuvwwwxyz abcdefghijklmnopqrstuvwwwxyz abcdefghijklmnopqrstuvwwwxyz";

        String searchSpace = " ";
        String searchW = "w";

        Integer countSpaceInFishText = countSameSymbol(fishText, searchSpace);
        Integer countSpaceInAbcdText = countSameSymbol(abcdText, searchSpace);
        Integer countWInFishText = countSameSymbol(fishText,searchW);
        Integer countWInAbcdText = countSameSymbol(abcdText, searchW);

        System.out.println("\"" + fishText + "\"" + "\n contains " + countSpaceInFishText + " Space symbols ");
        System.out.println();
        System.out.println("\"" + fishText + "\"" + "\n contains " + countWInFishText + " 'w' symbols ");
        System.out.println();
        System.out.println("\"" + abcdText + "\"" + "\n contains " + countSpaceInAbcdText + " Space symbols ");
        System.out.println();
        System.out.println("\"" + abcdText + "\"" + "\n contains " + countWInAbcdText + " 'w' symbols ");

    }

}