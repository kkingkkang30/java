package practice.chapter7;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner3{
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner{
        static int scv = outerCv;
    }

    void myMethod(){
        int lv = 0;
        final int LV =0;

        class LocalInner2{
            int liv = outerIv;
            int liv2 = outerCv;

            // 1.8부터만 에러아님
       //    int liv3 = lv;
            int liv4 = LV;
        }
    }
}
