public class CreateThread extends Thread {
    @Override
    public void run(){
        System.out.println("This code is running in a thread");
    }
    public static void main(String[]args){
        CreateThread thread = new CreateThread();
        thread.start();
        System.out.println("This code is outside the thread");

    }
}
