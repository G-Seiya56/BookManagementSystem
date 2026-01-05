package ReturnScreen;

import MainScreen.BMS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class BackHomeAction extends AbstractAction{
    private RFM rf;
    public BackHomeAction(RFM rf){
        this.rf = rf;
        putValue(Action.NAME,"戻る");
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        new BMS("書籍管理システム");
        rf.dispose();
    }
}
