package app;

import app.config.Config;
import app.config.annotation.ConfigPath;
import app.config.annotation.ConfigValue;
import app.config.impl.ConfigInitializer;
import app.net.NioServerSelector;
import app.system.Core;
import org.junit.Test;

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
