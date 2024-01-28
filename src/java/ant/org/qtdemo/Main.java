package org.qtdemo;

import io.qt.widgets.QApplication;
import io.qt.widgets.QMessageBox;

public class Main {
    public static void main(String[] args) {
        QApplication.initialize(args);
        QMessageBox.warning(null, "QtJambi_Demo", "I love Ky!\n");
        QApplication.shutdown();
    }
}
