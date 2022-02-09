package practice.chapter8;

class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false); // 예외발생 안함
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true); //  예외발생
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }
}

    class CloseableResource implements AutoCloseable{
        public void exceptionWork(boolean exception) throws WorkException{
            System.out.println("exceptionWork(" + exception+ " )가 호출됨");
            if(exception)
                throw new WorkException("workexceptino 발생");
        }

        public void close() throws  CloseException{
            System.out.println("close() 호출");
            throw new CloseException("closeexception 발생");
        }
    }

    class WorkException extends Exception{
        WorkException(String msg) {super(msg);}
    }
    class CloseException extends Exception{
        CloseException(String msg){super(msg);}
    }

