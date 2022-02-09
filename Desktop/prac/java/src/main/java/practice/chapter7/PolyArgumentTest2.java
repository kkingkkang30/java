package practice.chapter7;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new TV2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}


class Product2{
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product2(){

    }
}

class TV2 extends Product2{
    TV2(){
        super(100);
    }

    public String toString() {
        return "tv";
    }
}

class Computer2 extends Product2{
    Computer2(){
        super(200);
    }

    public String toString(){
        return "Computer";
    }
}

class Audio2 extends Product2{
    Audio2(){
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer2{
    int money = 1000;
    int bonuspoint =0;

    Product2[] item = new Product2[10];
    int i=0;
    void buy(Product2 p){
        if(money<p.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }

        money -= p.price;
        bonuspoint += p.bonusPoint;
        item[i++] = p;
        System.out.println("물건을 구입하였습니다");
    }
    
    void summary(){
        int sum =0;
        String itemList="";
        
        for(int i=0; i<item.length;i++){
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }

        System.out.println("sum = " + sum);
        System.out.println("itemList = " + itemList);
    }
}

