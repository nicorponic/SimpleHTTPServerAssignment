package HttpServerPack;

import java.util.concurrent.LinkedBlockingQueue;
 
    public class Take implements Runnable {
        
    private LinkedBlockingQueue queue;
    private boolean running;
    
    public Take(LinkedBlockingQueue queue) {
        this.queue = queue;

        running = true;
    }

    Take(HttpServerPack.SimplePoolThread queue) {
    }

    public boolean isRunning() {
        return running;
    }
    
    @Override
    public void run() {

        for (int i = 0; ; i++) {
            Integer simpletask = i;
            
            queue.take(simpletask);
            System.out.println("P\tRetrieving simple task: " + simpletask);
        }
    }
}
