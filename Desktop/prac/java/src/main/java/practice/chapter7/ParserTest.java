package practice.chapter7;

class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.XML");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.HTML");
    }
}

interface Parseable{
    // 구문 분석 작업
    public abstract void parse(String fileName);
}

class ParserManager{
    // 리턴 타입이 Parseable 인터페이스
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        }else {
           return new HTMLParser();
        }
    }
}

class XMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println("fileName = " + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable{
    @Override
    public void parse(String fileName) {
        System.out.println("fileName = " + "- HTML parsing completed");
    }
}