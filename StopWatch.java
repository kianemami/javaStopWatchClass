package com.company;

import java.util.Date;


public class StopWatch {
    private long timeElapsed = 0;
    private Date start = null;
    private Date end = null;
    public StopWatch(){

    }
    public void startTimer(){
        start = new Date();
    }
    public void endTimer(){
        end = new Date();
        timeElapsed = (end.getTime() - start.getTime());
    }
    public long getTimeElapsed(){
        if(end==null){
            return -1;
        }
        else{
            return this.timeElapsed;
        }
    }

}
