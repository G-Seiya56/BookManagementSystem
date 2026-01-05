package LendingScreen;

import MainScreen.BMS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class BackHomeAction extends AbstractAction{
    private LFM lf;
    public BackHomeAction(LFM lf){
        this.lf = lf;
        putValue(Action.NAME,"戻る");
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        new BMS("書籍管理システム");
        lf.dispose();
    }
}
