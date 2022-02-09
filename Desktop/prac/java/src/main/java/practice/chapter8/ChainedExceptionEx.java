package practice.chapter8;

public class ChainedExceptionEx {

    public static void main(String[] args) {
        try{
            install();
        }catch (InstallException2 e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static void install() throws InstallException2{
        try{
            startInstall();
            copyFiles();
        }catch(SpaceException2 se){
            InstallException2 ie = new InstallException2("설치 중 예외 발생");
            ie.initCause(se);
            throw ie;
        }catch(MemoryException2 me){
            InstallException2 ie = new InstallException2("설치 중 예외 발생");
            ie.initCause(me);
            throw  ie;
        }finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException2, MemoryException2 {
        if(!enoughSpace()){
            throw new SpaceException2("설치공간 부족");
        }

        if(!enoughMemory()){
            throw new MemoryException2("메모리 공간 부족");
           // throw new RuntimeException(new MemoryException2("메모리가 부족합니다"));
        }
    }

    static void copyFiles(){}
    static void deleteTempFiles(){}

    static boolean enoughSpace(){
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}
    class InstallException2 extends Exception{
        InstallException2(String msg){
            super(msg);
        }
    }

    class SpaceException2 extends Exception{
        SpaceException2(String msg){
            super(msg);
        }
    }

    class MemoryException2 extends Exception{
        MemoryException2(String msg){
            super(msg);
        }
    }



