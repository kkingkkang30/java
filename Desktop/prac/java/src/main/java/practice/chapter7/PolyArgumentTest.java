package practice.chapter7;

class PolyArgumentTest {
    public static void main(String[] args) {

        Buyer b = new Buyer();
        b.buy(new TV());
        b.buy(new Computer());

        System.out.println("b.money = " + b.money);
        System.out.println("b.bonuspoint = " + b.bonuspoint);
    }
}

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class TV extends Product{
    TV(){
        super(100);
    }

    public String toString() {
        return "tv";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    
    public String toString(){
        return "Computer";
    }
}

class Buyer{
    int money = 1000;
    int bonuspoint =0;
    
    void buy(Product p){
        if(money<p.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        
        money -= p.price;
        bonuspoint += p.bonusPoint;
        System.out.println("물건을 구입하였습니다");
    }
}
