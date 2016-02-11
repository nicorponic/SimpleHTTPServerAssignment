package HttpServerPack;

/*
 *   @author Behzad_Bordbar & Yi_Chen
 */

/**
 *   <<-- Pool Thread -->> 
 *
 *   It will be running continuously. It will try to retrieve new tasks when it is idle. 
 * interface,extends runnable-check, 
 * while(true), queue non empty-array,
 * 3 threads(capable of many methods 
 * when idle they look for new tasks
 * 
 */
public interface ISimplePoolThread extends Runnable {
	/**
	 *   Use an infinite loop to retrieve and perform tasks.
	 */
 
    @Override
    public void run();
  
}
