package HttpServerPack;

import java.util.concurrent.LinkedBlockingQueue;

public abstract class SimplePoolThread implements ISimplePoolThread {
 
    public static void main(String[] args) {

        LinkedBlockingQueue queue = new LinkedBlockingQueue();

        Put putter = new Put(queue);
        Take taker = new Take(queue);


        Thread putthread = new Thread(putter);
        Thread takethread = new Thread(taker);
        
        putthread.start();
        takethread.start();
    }

}
