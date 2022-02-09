package practice.chapter7;

import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        TV3 tv = new TV3();
        Computer3 com = new Computer3();
        Audio3 audio = new Audio3();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();

    }
}


class Product3{
    int price;
    int bonusPoint;

    Product3(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product3(){

    }
}

class TV3 extends Product3{
    TV3(){
        super(100);
    }

    public String toString() {
        return "tv";
    }
}

class Computer3 extends Product3{
    Computer3(){
        super(200);
    }

    public String toString(){
        return "Computer";
    }
}

class Audio3 extends Product3{
    Audio3(){
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer3{
    int money = 1000;
    int bonuspoint =0;

    Vector item = new Vector();

    int i=0;
    void buy(Product3 p){
        if(money<p.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }

        money -= p.price;
        bonuspoint += p.bonusPoint;
        item.add(p);
        System.out.println("물건을 구입하였습니다");
    }

    void refund(Product3 p ){
        if(item.remove(p)){
            money += p.price;
            bonuspoint -= p.bonusPoint;

            System.out.println("물건을 반품하였습니다.");
        }else{
            System.out.println("해당 물품을 구매하시지 않았습니다.");
        }
    }
    void summary(){
        int sum =0;
        String itemList="";

       for(int i=0;i<item.size();i++){
           Product3 p = (Product3) item.get(i);
           sum += p.price;
           itemList += (i==0)? "" + p : ", " + p;
       }

        System.out.println("sum = " + sum);
        System.out.println("itemList = " + itemList);
    }
}

