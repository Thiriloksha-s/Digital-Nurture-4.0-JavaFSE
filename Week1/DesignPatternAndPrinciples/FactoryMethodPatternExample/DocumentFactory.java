public class DocumentFactory {
    public static Document createDocument(String type) {
        String lower = type.toLowerCase(); 
        if (lower.equals("word")) {
            return new WordDocument();
        } else if (lower.equals("pdf")) {
            return new PdfDocument();
        } else {
            return new ExcelDocument();
        }
    }
}

