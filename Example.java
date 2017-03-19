package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileReader in = null;
        FileWriter out = null;

        StopWatch stopWatch = new StopWatch();
        stopWatch.startTimer();
        try {
            in = new FileReader("dd.dat");
            out = new FileWriter("out3.mp4");
            int c = 0;
            //char [] ne = in.to
             while((c=in.read())!=-1){
                out.write(c);
            }
            stopWatch.endTimer();
        }catch (Exception e){
            System.out.println("Error");
        }
        finally {
            out.close();
           in.close();
        }
        System.out.println(Long.toString(stopWatch.getTimeElapsed())+" millis");
        //System.out.println(Duration.between(starts, ends));

    }
}