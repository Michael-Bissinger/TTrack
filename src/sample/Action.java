package sample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Action {

        public static void start (String daytime, int waittime) throws InterruptedException, IOException {

                //waittime = 3; // just for testing
                TimeUnit.SECONDS.sleep(waittime);
                System.out.println("I waited");

                // Click button
                // Scroll down
                // Click Button


                if (daytime.equals("eve")) {
                        // Shut down pc and end this program
                        System.out.println("I am shutting down the pc");
                        String commandshut = "shutdown -s";
                        Process child = Runtime.getRuntime().exec(commandshut);
                }







        }
}
