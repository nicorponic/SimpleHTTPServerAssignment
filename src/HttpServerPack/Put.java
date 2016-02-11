package HttpServerPack;

import java.util.concurrent.LinkedBlockingQueue;
 
    public class Put implements Runnable {
        
    private LinkedBlockingQueue queue;
    private boolean running;

    public Put(LinkedBlockingQueue queue) {
        this.queue = queue;

        running = true;
    }

    Put(HttpServerPack.SimplePoolThread queue) {
    }

    public boolean isRunning() {
        return running;
    }
    @Override

    public void run() {

        for (int i = 0; ; i++) {
            Integer simpletask = i;
            
            try {
                queue.put(simpletask);
                System.out.println("P\tAdding element: " + simpletask);

            } catch (InterruptedException e) {
            }
        }
    }
}

