package by.teachmeskills.HomeWork10;
public class DocumentChecker {
    public static void printOfDocumentBuilder(String documentNumber) {
        StringBuilder builder = new StringBuilder("Letters: ");
        builder.append(documentNumber.substring(5, 8).toUpperCase())
                .append("/")
                .append(documentNumber.substring(14, 17).toUpperCase())
                .append("/")
                .append(documentNumber.substring(19, 20).toUpperCase())
                .append("/")
                .append(documentNumber.substring(21).toUpperCase());
        System.out.println(builder);
    }

    public static void printIfDocumentToUpperCase(String documentNumber) {
        System.out.println("Letters: " + documentNumber.substring(5, 8).toUpperCase() + "/" + documentNumber.substring(14, 17).toUpperCase() + "/"
                + documentNumber.substring(19, 20).toUpperCase() + "/" + documentNumber.substring(21).toUpperCase());
    }

    public static void printIfDokumentSubstringLikeNeed(String documentNumber) {
        System.out.println(documentNumber.substring(5, 8) + "/" + documentNumber.substring(14, 17) + "/"
                + documentNumber.substring(19, 20) + "/" + documentNumber.substring(21));
    }

    public static void printIfDokumentSubstring(String documentNumber) {
        System.out.println(documentNumber.substring(0, 4) + "***" + documentNumber.substring(9, 13) + "***" + "8k9l");
    }

    public static void printIfDocumentContainsLikeNeed(String documentNumber) {
        System.out.println(documentNumber.contains("abc"));
    }

    public static void printIfDocumentStartsWithLikeNeed(String documentNumber) {
        System.out.println(documentNumber.startsWith("555"));
    }

    public static void printIfDocumentEndsWithLikeNeeded(String documentNumber) {
        System.out.println(documentNumber.endsWith("1a2b"));
    }
}
