package HttpServerPack;

import java.util.concurrent.LinkedBlockingQueue;

public abstract class SimplePoolThread implements ISimplePoolThread {
 
    public static void main(String[] args) {

    SimpleThreadPool mt1 = new SimpleThreadPool("Worker #1");
    SimpleThreadPool mt2 = new SimpleThreadPool("Worker #2");
    SimpleThreadPool mt3 = new SimpleThreadPool("Worker #3");
        
     LinkedBlockingQueue queue = new LinkedBlockingQueue();

        Put putter = new Put(queue);
        Take taker = new Take(queue);

        Thread putthread = new Thread(putter);
        Thread takethread = new Thread(taker);
        
        putthread.start();
        takethread.start();
    }

}
