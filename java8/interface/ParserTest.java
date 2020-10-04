
class ParserTest {
    public static void main(String[] args) {
        Parseable parser = PasrserManager.getParser("XML");
        parser.parse("DOCUMENT.xml");

        parser = PasrserManager.getParser("HTML");
        parser.parse("DOCM.html");
    }
}

interface Parseable {
    void parse (String fileName);
}

class PasrserManager {
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
        }
    }

}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + " - XML parsing competed");
    }
}

class HTMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "-HTML parsing complete");
    }
}