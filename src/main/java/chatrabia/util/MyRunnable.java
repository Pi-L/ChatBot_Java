package chatrabia.util;

import chatrabia.domain.Message;

public abstract class MyRunnable {
    /**
     * Permet de créer un Runnable avec un paramètre
     * @param message
     * @return
     */
    public Runnable createRunnable( Message message){
        return () -> myRun(message);
    }
    protected abstract void  myRun(Message message);
}
