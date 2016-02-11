/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpServerPack;

/**
 *
 * @author N1CO
 * start a number of SimplePoolThread
 * initialize your task queue
 * In addTask(), you put the task to your queue
 */

class SimpleThreadPool implements ISimpleThreadPool, Runnable{
   
    Thread putter;
    Thread taker;
    // Construct a new thread.
    SimpleThreadPool(String name) {
        
    putter = new Thread(this, name);
    taker = new Thread(this, name);
    }
}
