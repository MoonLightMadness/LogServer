package app;

import app.config.Config;
import app.net.NioServerSelector;
import app.system.Core;

public class Application {

    public static void main(String[] args) {
        Config config = Core.configer;
        NioServerSelector selector = new NioServerSelector(config.read("LogServer.ip"),config.read("LogServer.port"));
        selector.read();
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
