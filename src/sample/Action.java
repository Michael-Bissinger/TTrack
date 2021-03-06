package sample;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Action {

        public static void start (String daytime, int waittime, String test, int coordinatex, int coordinatey) throws InterruptedException, IOException, AWTException {
                System.out.println("Start!");
                //waittime = 3; // just for testing
                TimeUnit.SECONDS.sleep(waittime);

//                if (test == "test") {
//                        System.out.println("I waited" + ". Testing: " + test);
//                } else {
//                        System.out.println("I waited" + ". Execute.");
//                }
                System.out.println("I waited" + ". Testing: " + test);

                Robot bot = new Robot();
                // Click button (doubleclick)
                if (!test.equals("test")) {
                        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }



                // Change cursor position
                TimeUnit.SECONDS.sleep(1);
                //bot.mouseMove(2782, 764); old version
                bot.mouseMove(coordinatex, coordinatey);

                // Click Button
                if (!test.equals("test")) {
                        TimeUnit.SECONDS.sleep(1);
                        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }

                if (daytime.equals("eve") && !test.equals("test")) {
                        // Shut down pc and end this program
                        TimeUnit.SECONDS.sleep(5);
                        bot.mouseMove(10, 10);
                        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

                        TimeUnit.SECONDS.sleep(5);
                        System.out.println("I am shutting down the pc");
                        String commandshut = "shutdown -s";
                        Process child = Runtime.getRuntime().exec(commandshut);
                }







        }
}
