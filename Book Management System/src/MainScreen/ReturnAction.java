package MainScreen;

import ReturnScreen.RFM;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class ReturnAction extends AbstractAction{
    private BMS bm;
    public ReturnAction(BMS bm){
        this.bm = bm;
        putValue(Action.NAME,"返却");
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        RFM rf = new RFM();
        Optional.of(rf);
        bm.dispose();
    }
}
