package sample;

import java.util.concurrent.TimeUnit;

public class Action {

        public static void start (String daytime, int waittime) throws InterruptedException {

                //waittime = 3; // just for testing
                TimeUnit.SECONDS.sleep(waittime);
                System.out.println("I waited");


                if (daytime.equals("eve")) {
                        // Shut down pc and end this program
                        System.out.println("I am shutting down the pc");
                }







        }
}
