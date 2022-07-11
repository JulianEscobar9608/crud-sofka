package org.example;

import org.example.interfaces.InterfaceMLog;
import org.jboss.logging.Logger;

public class MLog implements InterfaceMLog {

    private static final Logger mLog = Logger.getLogger(MLog.class);

    public void showError(String error) {
        mLog.error(error);
    }

    public void showOtherData(String data) {
        mLog.info(data);
    }

    public void showMenu(String data) {
        mLog.info("\n" + data);
    }
}
