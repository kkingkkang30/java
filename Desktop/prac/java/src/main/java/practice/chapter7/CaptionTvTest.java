package practice.chapter7;

class Tv{
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channalDown(){
        --channel;
    }
}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption) System.out.println("text = " + text);
    }
}
class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel =10;
        System.out.println("ctv.channel = " + ctv.channel);
        ctv.displayCaption("helllo");
        ctv.caption = true;
        ctv.displayCaption("heello");
    }
}
