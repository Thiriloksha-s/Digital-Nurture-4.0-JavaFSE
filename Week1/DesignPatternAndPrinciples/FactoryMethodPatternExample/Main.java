public class Main {
    public static void main(String[] args) {
        Document word = DocumentFactory.createDocument("word");
        word.open();
        Document pdf = DocumentFactory.createDocument("pdf");
        pdf.open();
        Document excel = DocumentFactory.createDocument("excel");
        excel.open();
    }
}
