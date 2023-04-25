package by.teachmeskills.HomeWork10;

import static by.teachmeskills.HomeWork10.DocumentChecker.*;

public class Ex1 {
    public static void main(String[] args) {
        String documentNumber = "1234-abc-5674-dfg-8k9l";
        printIfDokumentSubstring(documentNumber);
        printIfDokumentSubstringLikeNeed(documentNumber);
        printIfDocumentToUpperCase(documentNumber);

        printOfDocumentBuilder(documentNumber);

        printIfDocumentContainsLikeNeed(documentNumber);
        printIfDocumentStartsWithLikeNeed(documentNumber);
        printIfDocumentEndsWithLikeNeeded(documentNumber);

    }
}
