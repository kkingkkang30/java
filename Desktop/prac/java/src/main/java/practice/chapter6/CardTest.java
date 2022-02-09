package practice.chapter6;

class CardTest {
    public static void main(String[] args) {

        System.out.println("width = " + Card.width);
        System.out.println("height = " + Card.height);
        
        Card c1 = new Card();
        c1.kind = "clover";
        c1.number = 4;
        
        Card c2= new Card();
        c2.kind = "heart";
        c2.number = 2;

        System.out.println("c1 = " + c1.kind + c1.number + " width = " + c1.width + " height = " + c1.height);
        System.out.println("c2 = " + c2.kind + c2.number + " width = " + c2.width + " height = " + c2.height);
        
        c1.width = 30;
        c1.height = 30;

        System.out.println("c1 = " + c1.kind + c1.number + " width = " + c1.width + " height = " + c1.height);
        System.out.println("c2 = " + c2.kind + c2.number + " width = " + c2.width + " height = " + c2.height);


    }
}
class Card{
    // 인스턴스 변수. 인스턴스가 생성될 때 생성
    int number; 
    String kind;
    
    // 클래스 변수. 메모리에 클래스가 올라갈 때 생성
    static int width = 10;
    static int height = 20;
}
