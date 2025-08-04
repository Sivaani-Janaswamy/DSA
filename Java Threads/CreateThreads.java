public class CreateThreads implements Runnable{
    public static void main(String[] args) {
    CreateThreads obj = new CreateThreads();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
//Use isAlive() to avoid concurrency problems using Threads