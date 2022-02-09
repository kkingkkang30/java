package practice.chapter6;

public class TvTest4 {

    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; // 길이가 3인 tv 객체 배열

        for(int i=0; i<tvArr.length; i++ ){
            tvArr[i] = new Tv();
            tvArr[i].channel = i +10;
        }

        for(Tv tv: tvArr){
            tv.channelUp();
            System.out.println("tv 채널 = " +  tv.channel);
        }
    }
}
